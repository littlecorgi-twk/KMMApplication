import SwiftUI
import shared

struct ComposeView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        MainViewControllerKt.MainViewController()
    }
    
    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}

struct ContentView: View {
    var body: some View {
        ComposeView().ignoresSafeArea(.keyboard) // Compose has own keyboard handler
    }
}

//struct ContentView: View {
//
//    //    let data = HttpUtil().getData()
//    //	let greet = Greeting(text : data).greet()
//
//    @StateObject private var viewModel = ViewModel()
//
//
//    var body: some View {
//        VStack {
//            ScrollView {
//                Text(viewModel.resultText)
//            }
//            Button("Fetch Data") {
//                viewModel.fetchData()
//            }
//        }
//    }
//}
//
//struct ContentView_Previews: PreviewProvider {
//    static var previews: some View {
//        ContentView()
//    }
//}
