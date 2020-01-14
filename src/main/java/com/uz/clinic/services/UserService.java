package com.uz.clinic.services;

import com.uz.clinic.domain.User;
import com.uz.clinic.domain.Visit;
import com.uz.clinic.domain.VisitDto;
import com.uz.clinic.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public void addUser(User user) {
        userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public void removeUser(int id) {
        userRepository.deleteById(id);
    }

    public void updateUser(int id, User updatedUser) {
        Optional<User> oldUser = userRepository.findById(id);
        if(oldUser.isPresent()){
            if(updatedUser.getPesel() != null){
                oldUser.get().setPesel(updatedUser.getPesel());
            }

            if(updatedUser.getEmail() != null){
                oldUser.get().setEmail(updatedUser.getEmail());
            }

            if(updatedUser.getPassword() != null){
                oldUser.get().setPassword(updatedUser.getPassword());
            }

            if(updatedUser.getName() != null){
                oldUser.get().setName(updatedUser.getName());
            }

            if(updatedUser.getSurname() != null){
                oldUser.get().setSurname(updatedUser.getSurname());
            }

            if(updatedUser.getStreet() != null){
                oldUser.get().setStreet(updatedUser.getStreet());
            }

            if(updatedUser.getCity() != null){
                oldUser.get().setCity(updatedUser.getCity());
            }

            if(updatedUser.getZip_code() != null){
                oldUser.get().setZip_code(updatedUser.getZip_code());
            }

            if(updatedUser.getPhone() != null){
                oldUser.get().setPhone(updatedUser.getPhone());
            }
        }
    }
}
