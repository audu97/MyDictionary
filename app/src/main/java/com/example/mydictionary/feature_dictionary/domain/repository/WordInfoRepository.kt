package com.example.mydictionary.feature_dictionary.domain.repository

import com.example.mydictionary.core.util.Resource
import com.example.mydictionary.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow


interface WordInfoRepository {
    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}