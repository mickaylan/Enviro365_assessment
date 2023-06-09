package com.enviro.assessment.grad001.MickaylanHendricks.controller;

import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/image")
public class ImageController {

    @GetMapping(value = "/{name}/{surname}/{\\w\\.\\w}")
    public FileSystemResource getHttpImageLink(@PathVariable String name, @PathVariable String surname, @PathVariable String w) {
        String imagePath = "src/main/resources" + w;
        return new FileSystemResource(imagePath);
    }
}
