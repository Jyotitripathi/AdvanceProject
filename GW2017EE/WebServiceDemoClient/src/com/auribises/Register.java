/**
 * Register.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.auribises;

public interface Register extends java.rmi.Remote {
    public java.lang.String registerUser(java.lang.String name) throws java.rmi.RemoteException;
    public int INRToDollars(int inr) throws java.rmi.RemoteException;
    public int getWearther(java.lang.String city) throws java.rmi.RemoteException;
}
