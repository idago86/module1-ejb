/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dto.ClientDTO;
import dto.ContDTO;
import dto.TransactionDTO;
import ejbJMS.AccountSender;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;
import myWS.MonitorWS_Service;

/**
 *
 * @author Israel Dago
 */
@Stateless
public class ConturiService implements ConturiServiceRemote{

    @WebServiceRef(wsdlLocation = "http://buburutzapc:8080/MonitorWS/MonitorWS?wsdl")
    private MonitorWS_Service service;

    @EJB private AccountSender accountSender;
    
    @Override
    public void addAccount(ContDTO contDTO) {
        contDTO.setAction("add");
        accountSender.sendAccount(contDTO);
    }

    @Override
    public void removeAccount(ContDTO contDTO) {
        contDTO.setAction("remove");
        accountSender.sendAccount(contDTO);
    }
    
     @Override
    public void depunereNumar(TransactionDTO transactionDTO) {
        ContDTO contDTO = new ContDTO();
        contDTO.setTransactionDTO(transactionDTO);
        contDTO.setAction("depune");
        accountSender.sendAccount(contDTO);
    }

    @Override
    public void retragereNumar(TransactionDTO transactionDTO) {
        ContDTO contDTO = new ContDTO();
        contDTO.setTransactionDTO(transactionDTO);
        contDTO.setAction("retrage");
        accountSender.sendAccount(contDTO);
    }

    @Override
    public void transferNumar(TransactionDTO transactionDTO) {
        ContDTO contDTO = new ContDTO();
        contDTO.setTransactionDTO(transactionDTO);
        contDTO.setAction("transfer");
        accountSender.sendAccount(contDTO);
    }

    ///Methods From WebServices


    @Override
    public List<ContDTO> allAccounts() {
        myWS.MonitorWS port = service.getMonitorWSPort();
        return port.allAccounts().stream()
                .map(c -> new ContDTO(c.getId(), c.getIban(), c.getDescriere(),
                        c.getSold(), c.getCreationDate(), c.isActive(),
                        new ClientDTO(c.getClient().getId(), c.getClient().getNume(),
                                c.getClient().getPrenume(), c.getClient().getCnp())))
                .collect(Collectors.toList());          
    }

   
    
    
   
}
