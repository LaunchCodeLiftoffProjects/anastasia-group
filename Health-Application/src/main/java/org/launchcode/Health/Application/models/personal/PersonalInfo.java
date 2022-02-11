package org.launchcode.Health.Application.models.personal;

import com.sun.istack.NotNull;
import org.launchcode.Health.Application.models.data.AbstractEntity;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
    public class PersonalInfo extends AbstractEntity {
        @NotBlank
        @NotNull
        private String name;

        @NotBlank
        @NotNull
        @Email
        private String email;

        @NotBlank
        @NotNull
        private String age;

        @NotNull
        @NotBlank
        @Size(min = 1, max = 20, message = "Please type your gender")
        private String gender;

        @NotNull
        @NotBlank
        private String phoneNumber;

        @NotNull
        @NotBlank
        private String DBO;

        @NotNull
        @NotBlank
        private String address;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getDBO() {
            return DBO;
        }

        public void setDBO(String DBO) {
            this.DBO = DBO;
        }
}
