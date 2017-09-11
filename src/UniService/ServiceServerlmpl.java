package UniService;

import javax.xml.ws.Service;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.*;
import java.util.HashMap;

public class ServiceServerlmpl extends UnicastRemoteObject implements ServiceServer  {

    HashMap serviceList;

    public ServiceServerlmpl() throws RemoteException {
        setUpServices();
    }

    private void setUpServices() {

        serviceList = new HashMap () ;
        serviceList.put("Dice Rolling Service", new DiceService());
        serviceList.put("Day of the Week Service" , new DayOfTheWeekService());
        serviceList.put("Visual Music Service", new MiniMusicService()) ;



    }


    @Override
    public Object[] getServiceList() {
        System.out.println("in remote");
        return serviceList.keySet() .toArray();
    }

    @Override
    public Service getService(Object serviceKey) throws RemoteException {
        Service theService = (Service) serviceList.get(serviceKey);
        return theService;
    }

    public static void main (String[] args) {

        try {
            Naming.rebind("ServiceServer", new ServiceServerlmpl());
        } catch (Exception ex) {
            ex.printStackTrace();

            System.out.println("Remote service is running");


        }

    }


}
