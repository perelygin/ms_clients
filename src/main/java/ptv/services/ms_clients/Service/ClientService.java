package ptv.services.ms_clients.Service;

import ptv.services.ms_clients.entity.Clients;
import ptv.services.ms_clients.entity.Passports;

import java.util.List;

public interface ClientService {
    /**
     * Создает нового клиента
     * @param client - клиент для создания
     */
    void create(Clients client);

    /**
     * Возвращает список всех имеющихся клиентов
     * @return список клиентов
     */
    List<Clients> readAll();

    /**
     * Возвращает клиента по его имени
     * @param lastname - имя клиента
     * @return - объект клиента с заданным ID
     */
    List<Clients> readByName(String lastname);

    /*возвращает список клиентов по номеру паспорта
    @param passport -  номер паспорта
    @return - список клиентов
    */
    List<Clients> getClientsByPassport(String passport);

//    List<Passports> getPassportsByNumber(String passportNumber);

    /**
//     * Обновляет клиента с заданным ID,
//     * в соответствии с переданным клиентом
//     * @param client - клиент в соответсвии с которым нужно обновить данные
//     * @param id - id клиента которого нужно обновить
//     * @return - true если данные были обновлены, иначе false
//     */
//    boolean update(Clients client, int id);
//
//    /**
//     * Удаляет клиента с заданным ID
//     * @param id - id клиента, которого нужно удалить
//     * @return - true если клиент был удален, иначе false
//     */
//    boolean delete(int id);
}
