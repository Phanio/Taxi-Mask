package fr.et.intechinfo.mousqinfos.taximask.services;

import java.util.List;

import fr.et.intechinfo.mousqinfos.taximask.models.Client;

public interface ClientService {
	
	Client createClient(Client Client);

    Client updateClient(Client Client);

    List < Client > getAllClient();

    Client getClientById(long ClientId);

    void deleteClient(long id);

}
