package com.si5a.myquote.API;

import com.si5a.myquote.Model.QuoteModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {
    @GET("quotes")
    Call <List<QuoteModel>> ardRetrieve();
}