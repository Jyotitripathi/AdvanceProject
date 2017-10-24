package com.auribises;

public class RegisterProxy implements com.auribises.Register {
  private String _endpoint = null;
  private com.auribises.Register register = null;
  
  public RegisterProxy() {
    _initRegisterProxy();
  }
  
  public RegisterProxy(String endpoint) {
    _endpoint = endpoint;
    _initRegisterProxy();
  }
  
  private void _initRegisterProxy() {
    try {
      register = (new com.auribises.RegisterServiceLocator()).getRegister();
      if (register != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)register)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)register)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (register != null)
      ((javax.xml.rpc.Stub)register)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.auribises.Register getRegister() {
    if (register == null)
      _initRegisterProxy();
    return register;
  }
  
  public java.lang.String registerUser(java.lang.String name) throws java.rmi.RemoteException{
    if (register == null)
      _initRegisterProxy();
    return register.registerUser(name);
  }
  
  public int INRToDollars(int inr) throws java.rmi.RemoteException{
    if (register == null)
      _initRegisterProxy();
    return register.INRToDollars(inr);
  }
  
  public int getWearther(java.lang.String city) throws java.rmi.RemoteException{
    if (register == null)
      _initRegisterProxy();
    return register.getWearther(city);
  }
  
  
}