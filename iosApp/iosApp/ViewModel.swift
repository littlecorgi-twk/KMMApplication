//
//  ViewModel.swift
//  iosApp
//
//  Created by 田伟康 on 2024/7/28.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import shared

class ViewModel: ObservableObject {
    @Published var resultText: String = ""

    let httpUtil = HttpUtil()

    func fetchData() {
        httpUtil.getData { [weak self] (result, error) in
            DispatchQueue.main.async {
                if let error = error {
                    self?.resultText = "Error: \(error)"
                } else if let result = result {
                    self?.resultText = "Result: \(result)"
                }
            }
        }
    }
}
