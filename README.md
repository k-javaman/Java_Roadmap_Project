## English Version
 [English README](https://github.com/k-javaman/Java_Roadmap_Project/edit/main/README_EN.md)
## 만들게 된 이유

자바 개발자가 되기 위해 독학하면서, 어떤 순서로 공부해야할지 몰랐습니다. okky 등 여러 사이트를 참고하여 어떻게 공부해야 될지 정리하였고, 이를 웹사이트로 제작하게 되었습니다. 웹사이트는 2주 동안 만들었으며, 아직도 개선할 점이 많습니다. 따라서, 보완해야 될 점이 있다면 피드백 부탁드립니다!

**주의** : 자료, 순서 배치는 제가 했으나 내용들은 GPT가 작성했습니다. 약간 부자연스러운 점이 있어도 양해 부탁드립니다.

## 사용 스택

- **프론트엔드** : HTML, CSS, Bootstrap
- **백엔드** : Java, Spring Boot, Thymeleaf , Maven
- 배포 : AWS Beanstalk

## 배운점 및 느낀점

1. 부트스트랩 모달을 적용하고 어떻게 Spring Boot와 연동하는지에 대해 배웠습니다. [링크](https://medium.com/@kjavaman12/how-to-apply-bootstrap-modal-in-thymeleaf-439a37ac1b9d)
2. 부트스트랩을 통한 레이아웃에 대해 배웠습니다.
3. 초기세팅의 중요성에 대해 깨달았습니다. 처음에 Bootstrap4로 시작하였지만, Bootstrap5로 업데이트하려고 하니 기존의 기능이 비활성화되는 문제가 발생했습니다.
4. 이번 프로젝트에는 TDD를 적용하지 않았지만, chatgpt4로 생성한 코드들의 오류가 꼬리에 꼬리를 물고 생기는 것을 보고, 다음 프로젝트에는 TDD를 적용하겠다는 생각이 들었습니다.
5. 예외 처리가 되는 과정을 간단하게 적용시켜봤습니다. 단순히 static/error 폴더에 html을 추가시키는 것이 아닌, 더 자세한 오류 결과를 나타내기 위해서 GlobalExceptionHandler, ResourceNotFoundException 등등을 추가시켜야 한다는 점을 배웠습니다! (이것들이 어떻게 작동되는지에 대해서 더 공부한 후에 다른 오류 코드를 추후에 추가하도록 하겠습니다)
6. 국제화에 대해서 배우고, 개인적으로 나중에 리팩토링을 할때는 en, ko 폴더를 만들고 languagecode를 이용해서 연결하는 것 보다는 en,ko폴더를 만들지 않고 모두 thymeleaf - messages.properties로 처리를 할 예정입니다, languagecode를 잘못 사용하면 css/경로가 아닌 en/cs/ 에 있는 styles.css를 찾음으로써 이런 방법은 오류가 쉽게 생길 수 있다고 생각했기 때문입니다.
원래는 LocaleChangeInterceptor, addInterceptors를 사용해서 국제화를 구현해보려 했으나 오류가 생겨서 급한대로 Accept-Language에 따라 언어를 세팅해주는 AcceptHeaderLocaleResolver를 사용했습니다.
7. 네이밍의 중요성에 대해서 배웠습니다. 원래는 그냥 NavbarController 이렇게 지었는데, 이렇게 만들면 컨트롤러의 의도를 쉽게 파악할 수 없어서 PageViewController 등 목적과 의도가 드러나도록 최대한 노력하면서 컨트롤러의 이름을 작성해봤습니다
8. 지금도 많이 부족하지만 기능을 작성하기 전에 항상 커밋을 해주는 습관을 들이도록 노력해야 한다는 것을 깨달았습니다. 그렇지 않으면 그 전의 기능으로 돌아가기 위해서 수십번 컨트롤+z를 눌러줘야 하는데, 이러다가 많은 시간을 소비했고 앞으로는 그러지 않도록 노력하겠습니다.

## 앞으로 배울 것들 및 다음 프로젝트(CRUD 웹사이트)에 적용하고 싶은 것들

- 다음 프로젝트에서는 HTML, CSS를 보다 심도있게 공부하고 싶습니다. 이번 프로젝트에서는 거의 GPT-4에 의존하여 작성하였기 때문입니다.
- TDD
- 클린코드
- 리팩토링
- 디자인패턴
- MySQL
- Querydsl
- Swagger 통한 API 명세서
- 결제 기능
- 디버깅을 통한 오류 해결
- 페이징, 소팅
- 노션을 통한 프로젝트 정리
- Spring JPA
- Spring 시큐리티
