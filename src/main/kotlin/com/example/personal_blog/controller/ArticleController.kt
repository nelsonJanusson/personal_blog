package com.example.personal_blog.controller

import com.example.personal_blog.model.Article
import com.example.personal_blog.service.ArticleService
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
@RequestMapping("/api/article")
class ArticleController(private val articleService: ArticleService) {

    @RequestMapping("/{content}")
    fun createArticle(@PathVariable content:String){
        articleService.createArticle(Article(content))
    }


}