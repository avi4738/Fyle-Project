/*
 * package com.project.fyle.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.CrossOrigin; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.ResponseBody; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.projec.fyle.security.AccountCredentials;
 * 
 * 
 * @RestController
 * 
 * @CrossOrigin(origins = "http://localhost:4200") public class LoginController
 * {
 * 
 * 
 * 
 * @RequestMapping(value = {"/login" }, method ={ RequestMethod.POST })
 * 
 * @ResponseBody public ResponseEntity<Object> login(@RequestBody
 * AccountCredentials accountCredentials) { try { return new
 * ResponseEntity<Object>(accountCredentials, HttpStatus.OK); }catch(Exception
 * e) {
 * 
 * return new ResponseEntity<Object>("error", HttpStatus.OK); } }
 * 
 * 
 * 
 * 
 * }
 */