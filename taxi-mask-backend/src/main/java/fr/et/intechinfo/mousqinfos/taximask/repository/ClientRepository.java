package fr.et.intechinfo.mousqinfos.taximask.repository;

import fr.et.intechinfo.mousqinfos.taximask.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
