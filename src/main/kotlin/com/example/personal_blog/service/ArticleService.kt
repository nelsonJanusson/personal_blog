package com.example.personal_blog.service

import com.example.personal_blog.model.Article
import org.springframework.stereotype.Service

@Service
class ArticleService {
    fun createArticle(article: Article){
        article.printText()
    }
}