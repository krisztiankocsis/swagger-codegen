package com.wordnik.model;

import com.wordnik.common.WordnikObject;
import com.wordnik.annotations.AllowableValues;
import com.wordnik.annotations.Required;

import com.wordnik.common.WordListType;
import com.wordnik.common.StringValue;
import com.wordnik.common.Size;


/**
 * 
 * NOTE: This class is auto generated by the drive code generator program so please do not edit the program manually.  
 * @author ramesh
 *
 */
public class ScoredWord extends WordnikObject {

		 //
		 private Long id ;  
			 //
		 private String wordType ;  
			 //
		 private int position ;  
			 //
		 private String word ;  
			 //
		 private float score ;  
			 //
		 private Long sentenceId ;  
			 //
		 private String partOfSpeech ;  
		
	
		 //
		 
		 public Long getId() {
		 	return id;
		 }  
		 
		 public void setId(Long  id) {
		 	this.id = id;
		 }
			 //
		 
		 public String getWordType() {
		 	return wordType;
		 }  
		 
		 public void setWordType(String  wordType) {
		 	this.wordType = wordType;
		 }
			 //
		 
		 public int getPosition() {
		 	return position;
		 }  
		 
		 public void setPosition(int  position) {
		 	this.position = position;
		 }
			 //
		 
		 public String getWord() {
		 	return word;
		 }  
		 
		 public void setWord(String  word) {
		 	this.word = word;
		 }
			 //
		 
		 public float getScore() {
		 	return score;
		 }  
		 
		 public void setScore(float  score) {
		 	this.score = score;
		 }
			 //
		 
		 public Long getSentenceId() {
		 	return sentenceId;
		 }  
		 
		 public void setSentenceId(Long  sentenceId) {
		 	this.sentenceId = sentenceId;
		 }
			 //
		 
		 public String getPartOfSpeech() {
		 	return partOfSpeech;
		 }  
		 
		 public void setPartOfSpeech(String  partOfSpeech) {
		 	this.partOfSpeech = partOfSpeech;
		 }
		
}