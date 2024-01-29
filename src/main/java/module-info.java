module com.example {
  requires spring.boot;
  requires spring.boot.autoconfigure;

  requires spring.web;
  requires spring.webmvc;

  requires spring.context;
  requires spring.beans;
  //requires spring.data.commons;
  requires spring.core;
  requires org.apache.tomcat.embed.core;

  //requires spring.data.mongodb;
  //requires org.mongodb.bson;

  requires lombok;

  requires thymeleaf.spring6;
  requires thymeleaf;
  requires org.slf4j;

  exports com.example.controller;
  exports com.example.demo;
  exports com.example.viewmodel;

  opens com.example.controller to spring.core, spring.beans, spring.web;
  opens com.example.demo to spring.core, spring.beans, spring.web;
  opens com.example.viewmodel to spring.core, spring.beans, spring.web;
}