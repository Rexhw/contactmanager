/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanager;

/**
 *
 * @author rexbolt1
 */
public class Contact {
    private String userName;
    private String userLast;
    private String userEmail;
    private String userPhone;
    
         public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserName() {
            return userName;
        }
    /**
     * @return the userPassword
     */
        public void setUserLast(String userLast) {
            this.userLast = userLast;
        }
        
        public String getUserLast() {
            return userLast;
        }

    /**
     * @param userPassword the userPassword to set
     */
     

    /**
     * @return the userEmail
     */
        public String getUserEmail() {
            return userEmail;
        }

    /**
     * @param userEmail the userEmail to set
     */
        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }

    /**
     * @return the userPhone
     */
        public String getUserPhone() {
            return userPhone;
        }
        
        public void setUserPhone(String userPhone) {
            this.userPhone = userPhone;
        }
        
        public String toString(){
            return userName + ", " + userLast;
        }
}
