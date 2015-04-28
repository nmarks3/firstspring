/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstspring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author nmarks3
 */
public class FIRSTSPRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        
        OwnerService owner = (OwnerService) ctx.getBean("owner");
        Animal pet = owner.getPet();
        pet.speak();
    }
    
}
