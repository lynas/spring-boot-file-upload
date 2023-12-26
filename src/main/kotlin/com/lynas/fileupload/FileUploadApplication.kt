package com.lynas.fileupload

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@SpringBootApplication
class FileUploadApplication

fun main(args: Array<String>) {
    runApplication<FileUploadApplication>(*args)
}

@RestController
class FileUploadController {

    @PostMapping("/upload")
    fun uploadFile(@RequestParam("file") file: MultipartFile): String {

        return "File upload successful"
    }
}