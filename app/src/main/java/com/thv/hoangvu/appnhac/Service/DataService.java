package com.thv.hoangvu.appnhac.Service;

import com.thv.hoangvu.appnhac.Model.Album;
import com.thv.hoangvu.appnhac.Model.BaiHat;
import com.thv.hoangvu.appnhac.Model.PlayList;
import com.thv.hoangvu.appnhac.Model.QuangCao;
import com.thv.hoangvu.appnhac.Model.TheLoaiTrongNgay;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface DataService {

    @GET("songbanner.php")
    Call<List<QuangCao>> getDataBanner();

    @GET("playlistforcurrentday.php")
    Call<List<PlayList>> getPlayListCurrentDay();

    @GET("chudevatheloaitrongngay.php")
    Call<TheLoaiTrongNgay> getCategoryMusic();

    @GET("albumhot.php")
    Call<List<Album>> getAlbumHot();

    @GET("baihatyeuthich.php")
    Call<List<BaiHat>> getBaiHatHot();

    @FormUrlEncoded
    @POST("danhsachbaihat.php")
    Call<List<BaiHat>> getDanhSachBaiHatTheoQuangCao(@Field("idquangcao") String idQuangCao);

    @FormUrlEncoded
    @POST("danhsachbaihat.php")
    Call<List<BaiHat>> getDanhSachBaiHatTheoPlayList(@Field("idplaylist") String idPlayList);


    @GET("danhsachplaylist.php")
    Call<List<PlayList>> getDanhSachPlaylist();
}
