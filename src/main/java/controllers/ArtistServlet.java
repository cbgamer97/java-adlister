package controllers;

import dao.Artists;
import dao.ArtistsDao;
import models.Artist;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/artist")
public class ArtistServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Artists artistsDao = new ArtistsDao();
        List<Artist> artists = artistsDao.all();
        req.setAttribute("artists", artists);
        req.getRequestDispatcher("artist.jsp").forward(req, resp);
    }
}
