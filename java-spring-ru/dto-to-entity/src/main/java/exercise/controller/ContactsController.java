package exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import exercise.model.Contact;
import exercise.repository.ContactRepository;
import exercise.dto.ContactDTO;
import exercise.dto.ContactCreateDTO;

@RestController
@RequestMapping("/contacts")
public class ContactsController {

    @Autowired
    private ContactRepository contactRepository;

    // BEGIN
    private ContactDTO toContactDTO(Contact contact) {
        var result = new ContactDTO();
        result.setId(contact.getId());
        result.setFirstName(contact.getFirstName());
        result.setLastName(contact.getLastName());
        result.setPhone(contact.getPhone());
        result.setCreatedAt(contact.getCreatedAt());
        result.setUpdatedAt(contact.getUpdatedAt());
        return result;
    }

    private Contact toContact(ContactCreateDTO contactCreateDTO) {
        var result = new Contact();
        result.setFirstName(contactCreateDTO.getFirstName());
        result.setLastName(contactCreateDTO.getLastName());
        result.setPhone(contactCreateDTO.getPhone());
        return result;
    }

    @PostMapping(path = "")
    @ResponseStatus(HttpStatus.CREATED)
    public ContactDTO create(@RequestBody ContactCreateDTO contactCreateDTO) {
        var contact = toContact(contactCreateDTO);
        contactRepository.save(contact);
        return toContactDTO(contact);
    }


    // END
}
