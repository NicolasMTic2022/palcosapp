package com.usa.palcosapp.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name ="message")
@NoArgsConstructor
@Getter
@Setter

public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;

    @ManyToOne
    @JoinColumn(name ="idBox")
    @JsonIgnoreProperties({"message ", "client","reservation"})
    private Box box;

    @ManyToOne
    @JoinColumn(name ="idClient")
    @JsonIgnoreProperties({"message ", "client","reservation"})
    private Client client;


}

