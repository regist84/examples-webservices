package example.users.webservice.server;

import example.users.webservice.model.ResponseUser;
import example.users.webservice.model.User;
import javax.jws.WebMethod;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

//webservice interface SEI SOAP
//@WebService
@Produces("application/json")
@Consumes({"application/xml","application/json","application/x-www-form-urlencoded"})
public interface IUsersService {

    @WebMethod()
//    @GET
//    @Path("/users")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public List<User> getUsers();
    @GET
    @Path("/usersList/")
    public ResponseUser getUsersList();
    
    @POST
    @Path("/insertUser")
    public ResponseUser insertUser(User user);
}
