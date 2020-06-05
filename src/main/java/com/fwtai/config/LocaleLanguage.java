package com.fwtai.config;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-06-05 19:48
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
 */
public class LocaleLanguage implements LocaleResolver{

    @Override
    public Locale resolveLocale(final HttpServletRequest request){
        final String language = request.getParameter("language");
        if(StringUtils.isEmpty(language)){
            //路径上没有国际化语言参数，采用默认的（从请求头中获取）
            return request.getLocale();
        }else{
            try {
                final String[] split = language.split("_");
                //语言、国家构造器
                return new Locale(split[0],split[1]);
            } catch (final Exception e){
                return request.getLocale();
                //return new Locale("zh","CN");
            }
        }
    }

    @Override
    public void setLocale(final HttpServletRequest request,final HttpServletResponse response,final Locale locale){
    }
}