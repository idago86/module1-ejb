/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dto.ClientDTO;
import ejbJMS.ClientiSender;
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
public class ClientsServces implements ClientiServiceRemote {

    @WebServiceRef(wsdlLocation = "http://buburutzapc:8080/MonitorWS/MonitorWS?wsdl")
    private MonitorWS_Service service;
    
    @EJB private ClientiSender clientiSender;
    
    @Override
    public void adaugaClient(ClientDTO clientDTO) {        
        clientDTO.setAction("add");
        clientiSender.sendClient(clientDTO);        
    }

    @Override
    public void removeClient(ClientDTO clientDTO) {
        clientDTO.setAction("remove");
        clientiSender.sendClient(clientDTO);
       
    }

    
    
    ///Methods From WebServices

    @Override
    public List<ClientDTO> allClienti() {
        myWS.MonitorWS port = service.getMonitorWSPort();
        return port.allClienti().stream()
                .map(c -> new ClientDTO(c.getId(), c.getNume(), c.getPrenume(), c.getCnp()))
                .collect(Collectors.toList());
    }

 
    

    

 

    
    
    
   
}
