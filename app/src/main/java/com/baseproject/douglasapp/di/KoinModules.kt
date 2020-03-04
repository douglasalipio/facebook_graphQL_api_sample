package com.baseproject.douglasapp.di

import org.koin.dsl.module.module

val appModule = module {
	//	single<RxSchedulers> { RxSchedulersImpl() }
}

val viewsModule = module {
	//	factory { StatusPresenter(get(), get()) }
//	factory { LinesStatusAdapter() }
}

val interactorsModule = module {
	//	factory { GetLinesStatusInteractor(get(), get()) }
}

val repositoryModule = module {
	//	single<StatusRepository> { StatusRepositoryImpl(get(), get()) }
}

val mappersModule = module {
	//	single { LineStatusModelToLineStatusMapper() }
//	single { LineStatusToLineStatusPresentationMapper() }
}
