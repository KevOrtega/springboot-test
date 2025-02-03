package com.kevortega.spring.springboot_test.interceptors;

import java.time.Instant;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TimeInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull Object handler)
            throws Exception {
        request.setAttribute("start", Instant.now().toEpochMilli());
        return true;
    }

    @Override
    public void postHandle(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull Object handler,
            @Nullable ModelAndView modelAndView) throws Exception {
        Long start = (Long) request.getAttribute("start");
        Long end = Instant.now().toEpochMilli();
        System.err.println("Time: " + (end - start) + "ms");
    }
}

