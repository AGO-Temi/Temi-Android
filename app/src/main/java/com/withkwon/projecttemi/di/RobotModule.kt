package com.withkwon.projecttemi.di

import com.robotemi.sdk.Robot
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RobotModule {
    @Singleton
    @Provides
    fun provideRobotInstance(): Robot = Robot.getInstance()
}