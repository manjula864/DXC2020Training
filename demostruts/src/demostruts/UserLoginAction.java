package demostruts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class UserLoginAction extends Action {
	 public ActionForward execute(ActionMapping map,ActionForm form,HttpServletRequest req,HttpServletResponse resp) {

		  UserLoginForm ref=(UserLoginForm) form;
		  String user=ref.getUsername();
		  String pass=ref.getPassword();
		  
		  if(user.equals("teja")&&pass.equals("123"))
		  {
			  return map.findForward("success");
			  
		  }
		  else
		  return map.findForward("failure");
	}
}
