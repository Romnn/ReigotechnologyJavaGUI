
/**
 * Write a description of class RigoTechnology here.
 *
 * @author (18029179 Roman Parajuli)
 * @version (26 March 2019)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class RigoTechnology implements ActionListener{


    
    public static void main(String arg[]){
        
        JFrame frm = new JFrame("Appointment System");
        
        //labels for junior Developer
      
       JLabel juniorDev = new JLabel("Junior Developer");
       juniorDev.setBounds(250,10,150,30);
       frm.add(juniorDev);
       
       
       JLabel platform = new JLabel("Platform:");
       JLabel interviewersName = new JLabel("Interviewers Name:");
       JLabel salary = new JLabel("Salary:");
       JLabel workingHours = new JLabel("Working Hours:");
       JLabel appointedBy = new JLabel("Appointed By:");
       JLabel terminateDate = new JLabel("Terminate Date:");
    
       platform.setBounds(10,40,100,30); 
       interviewersName.setBounds(10,70,150,30);
       salary.setBounds(10,100,80,30);
       workingHours.setBounds(300,100,100,30);
       terminateDate.setBounds(300,130,100,30);
       appointedBy.setBounds(10,130,130,30);
       
       frm.add(platform);
       frm.add(interviewersName);
       frm.add(salary);
       frm.add(workingHours);
       frm.add(terminateDate);
       frm.add(appointedBy);
       
       JTextField platformTxtFld = new JTextField();
       JTextField interviewersNameTxtFld = new JTextField();
       JTextField salaryTxtFld = new JTextField();
       JTextField workingHoursTxtFld = new JTextField();
       JTextField appointedByTxtFld = new JTextField();
       JTextField terminateDateTxtFld = new JTextField();
       
       
       platformTxtFld.setBounds(130,40,440,30);
       interviewersNameTxtFld.setBounds(130,70,440,30);
       salaryTxtFld.setBounds(130,100,150,30);
       workingHoursTxtFld.setBounds(420,100,150,30);
       appointedByTxtFld.setBounds(130,130,150,30);
       terminateDateTxtFld.setBounds(420,130,150,30);
       
       frm.add(platformTxtFld);
       frm.add(interviewersNameTxtFld);
       frm.add(salaryTxtFld);
       frm.add(workingHoursTxtFld);
       frm.add(appointedByTxtFld);
       frm.add(terminateDateTxtFld);
       
       JButton btnAdd = new JButton("Add");
       btnAdd.setBounds(420,170,150,40);
       frm.add(btnAdd);
       
       
       

       JLabel developersName = new JLabel("Developer's Name:");
       JLabel appointedDate = new JLabel("Appointed Date:");
       JLabel terminationDate = new JLabel("Termination Date:");
       JLabel platformNumber = new JLabel("Platform Number:");
       JLabel specialization = new JLabel("Specilization:");
       
       developersName.setBounds(10,220,150,30);
       appointedDate.setBounds(10,255,150,30);
       terminationDate.setBounds(300,255,150,30);
       platformNumber.setBounds(10,290,150,30);
       specialization.setBounds(300,290,150,30);

       
       frm.add(developersName);
       frm.add(appointedDate);
       frm.add(terminationDate);
       frm.add(platformNumber);
       frm.add(specialization);
       
       JTextField developersNameTxtFld = new JTextField();
       JTextField appointedDateTxtFld = new JTextField();
       JTextField terminationDateTxtFld = new JTextField();
       JTextField platformNumTxtFld = new JTextField();
       JTextField specilizationTxtFld = new JTextField();
       

       developersNameTxtFld.setBounds(130,220,440,30);
       appointedDateTxtFld.setBounds(130,255,150,30);
       terminationDateTxtFld.setBounds(420,255,150,30);
       platformNumTxtFld.setBounds(130,290,150,30);
       specilizationTxtFld.setBounds(420,290,150,30);
       
       
       frm.add(developersNameTxtFld);
       frm.add(appointedDateTxtFld);
       frm.add(terminationDateTxtFld);
       frm.add(platformNumTxtFld);
       frm.add(specilizationTxtFld);

       JButton btnHire = new JButton("Hire");
       btnHire.setBounds(420,330,150,40);
       frm.add(btnHire);

      
       
       // Seniior Developers Form
       
      JLabel seniorDev = new JLabel("Senior Developer");
      seniorDev.setBounds(250,400,150,30);
      frm.add(seniorDev);
       
       JLabel srPlatform = new JLabel("Platform:");
       JLabel srInterviewersName = new JLabel("Interviewers Name:");
       JLabel srSalary = new JLabel("Salary:");
       JLabel srWorkingHours = new JLabel("Working Hours:");
       JLabel srContractPeriod = new JLabel("Contract Period:");
       
       
       srPlatform.setBounds(10,440,100,30); 
       srInterviewersName.setBounds(10,470,150,30);
       srSalary.setBounds(10,500,80,30);
       srWorkingHours.setBounds(300,500,100,30);
       srContractPeriod.setBounds(10,530,530,30);

       frm.add(srPlatform);
       frm.add(srInterviewersName);
       frm.add(srSalary);
       frm.add(srWorkingHours);
       frm.add(srContractPeriod);
       
       
       JTextField srPlatformTxtFld = new JTextField();
       JTextField srInterviewersNameTxtFld = new JTextField();
       JTextField srSalaryTxtFld = new JTextField();
       JTextField srWorkingHoursTxtFld = new JTextField();
       JTextField srContractPeriodTxtFld = new JTextField();
       
       srPlatformTxtFld.setBounds(130,440,440,30);
       srInterviewersNameTxtFld.setBounds(130,470,440,30);
       srSalaryTxtFld.setBounds(130,500,150,30);
       srWorkingHoursTxtFld.setBounds(420,500,150,30);
       srContractPeriodTxtFld.setBounds(130,530,150,30);
       
       frm.add(srPlatformTxtFld);
       frm.add(srInterviewersNameTxtFld);
       frm.add(srSalaryTxtFld);
       frm.add(srWorkingHoursTxtFld);
       frm.add(srContractPeriodTxtFld);
       
       JButton srBtnAdd = new JButton("Add");
       srBtnAdd.setBounds(420,570,150,40);
       frm.add(srBtnAdd);
       
 
       JLabel srDevelopersName = new JLabel("Developer's Name:");
       JLabel srJoiningDate = new JLabel("Joining Date:");
       JLabel srAdvanceSalary = new JLabel("Advance Salary:");
       JLabel srPlatformNumber = new JLabel("Platform Number:");
       JLabel srStaffRoomNumb = new JLabel("Staff Room Number:");
       
       srDevelopersName.setBounds(10,620,150,30);
       srJoiningDate.setBounds(10,655,150,30);
       srAdvanceSalary.setBounds(300,655,150,30);
       srPlatformNumber.setBounds(10,690,150,30);
       srStaffRoomNumb.setBounds(290,690,150,30);
        

       frm.add(srDevelopersName);
       frm.add(srJoiningDate);
       frm.add(srAdvanceSalary);
       frm.add(srPlatformNumber);
       frm.add(srStaffRoomNumb);
       

       JTextField srDevelopersNameTxtFld = new JTextField();
       JTextField srJoiningDateTxtFld = new JTextField();
       JTextField srAdvanceSalaryTxtFld = new JTextField();
       JTextField srPlatformNumberTxtFld = new JTextField();
       JTextField srSpecializationTxtFld = new JTextField();
       
       srDevelopersNameTxtFld.setBounds(130,620,440,30);
       srJoiningDateTxtFld.setBounds(130,655,150,30);
       srAdvanceSalaryTxtFld.setBounds(420,655,150,30);
       srPlatformNumberTxtFld.setBounds(130,690,150,30);
       srSpecializationTxtFld.setBounds(420,690,150,30);
       
       frm.add(srDevelopersNameTxtFld);
       frm.add(srJoiningDateTxtFld);
       frm.add(srAdvanceSalaryTxtFld);
       frm.add(srPlatformNumberTxtFld);
       frm.add(srSpecializationTxtFld);

       JButton displayAllBtn = new JButton("Display");
       displayAllBtn.setBounds(10,750,120,40);
       frm.add(displayAllBtn);

       JButton allClearBtn = new JButton("Clear");
       allClearBtn.setBounds(150,750,120,40);
       frm.add(allClearBtn);
       
       JButton srHireBtn = new JButton("Hire");
       srHireBtn.setBounds(290,750,120,40);
       frm.add(srHireBtn);
       
       JButton srTerminateBtn = new JButton("Terminate");
       srTerminateBtn.setBounds(440,750,120,40);
       frm.add(srTerminateBtn);
       
       // Frame Layout 
       frm.setLayout(null);
       frm.setVisible(true);
       frm.setSize(600,850);
       frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public void actionPerformed(ActionEvent aE){


    }
    
    
}
