https://droidknights.github.io/2020/

# DroidKnights 2020 - Declarative UI 도입을 향한 여정
**Declarative UI 도입을 향한 여정** 세션 발표에서 사용된 샘플 코드입니다.

## 구성
<img src="https://github.com/devussy/Declarative-UI-Sample/blob/master/screenshot.png" width=300/>


- 모델
  - NumberModel
- 구성 요소
  - Section Header
  - Item


## 프레임워크 및 라이브러리
- Jetpack Compose
  - [참고 링크](https://developer.android.com/jetpack/compose)
  - [작업 위치](https://github.com/devussy/Declarative-UI-Sample/tree/master/compose/src/main/java/pe/devussy/compose)
- Facebook Litho
  - [참고 링크](https://github.com/facebook/litho)
  - [작업 위치](https://github.com/devussy/Declarative-UI-Sample/tree/master/app/src/main/java/pe/devussy/droidknights2020/litho)
- Airbnb Epoxy
  - [참고 링크](https://github.com/airbnb/epoxy)
  - [작업 위치](https://github.com/devussy/Declarative-UI-Sample/tree/master/app/src/main/java/pe/devussy/droidknights2020/epoxy)

## 개발 환경
- 프로젝트가 Jetpack Compose 를 포함하여 구성되었기 때문에 최신 [Android Studio 4.2 Canary](https://developer.android.com/studio/preview) 가 필요합니다.
- Kotlin Compiler 충돌을 해결하고자 compose 모듈을 별도로 분리했습니다.
