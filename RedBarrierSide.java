package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeRedDark;

public class RedBarrierSide {
    public static void main(String args[]) {
        MeepMeep mm = new MeepMeep(800)
                .setBackground(MeepMeep.Background.FIELD_FREIGHT_FRENZY)
                .setTheme(new ColorSchemeRedDark())
                .setBackgroundAlpha(1f)
                .setConstraints(64.03563225478843, 34.110287416570166, Math.toRadians(138.19991297468354), Math.toRadians(138.19991297468354), 34.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder (new Pose2d(10, -62, Math.toRadians(270)))
                                .lineToSplineHeading(new Pose2d(-5, -44, Math.toRadians(290)))
                                .waitSeconds(3)
                                .lineToSplineHeading(new Pose2d(-5, -45, Math.toRadians(0)))
                                .lineTo(new Vector2d(56, -48))
                                .build()

                )
                .start();
    }
}
