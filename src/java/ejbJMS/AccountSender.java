/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbJMS;

import dto.ContDTO;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;

/**
 *
 * @author Israel Dago
 */
@Stateless
@LocalBean
public class AccountSender {

    @Resource(mappedName = "jms/myQueueACCOUNTS")
    private Queue myQueueACCOUNTS;

    @Inject
    @JMSConnectionFactory("java:comp/DefaultJMSConnectionFactory")
    private JMSContext context;

    
    public void sendAccount(ContDTO account){ 
        context.createProducer().send(myQueueACCOUNTS, account);
    }
    
}
