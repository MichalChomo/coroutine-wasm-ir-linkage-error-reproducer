# coroutine-wasm-ir-linkage-error-reproducer

## How to run
```
./gradlew wasmJsBrowserRun
```
The `IrLinkageError` will appear in the console. Refresh the page and check the console again for the full stacktrace.

## My error in the browser console
```
IrLinkageError: Can not read value from variable 'tmp0_safe_receiver': Variable uses unlinked class symbol 'kotlinx.coroutines.internal/LinkedListHead|null[0]'
kotlinx.coroutines.error_$external_fun @ composeApp.uninstantiated.mjs:4330
$kotlinx.coroutines.error_$external_fun__externalAdapter @ composeApp.wasm:0x389412
$kotlinx.coroutines.internal.propagateExceptionFinalResort @ CoroutineExceptionHandlerImpl.kt:7
$kotlinx.coroutines.internal.handleUncaughtCoroutineException @ CoroutineExceptionHandlerImpl.common.kt:48
$kotlinx.coroutines.handleCoroutineException @ CoroutineExceptionHandler.kt:30
$kotlinx.coroutines.StandaloneCoroutine.handleJobException @ Builders.common.kt:191
$kotlinx.coroutines.JobSupport.finalizeFinishingState @ composeApp.wasm:0x363362
$kotlinx.coroutines.JobSupport.tryMakeCompletingSlowPath @ JobSupport.kt:946
$kotlinx.coroutines.JobSupport.tryMakeCompleting @ JobSupport.kt:894
$kotlinx.coroutines.JobSupport.makeCompletingOnce @ JobSupport.kt:859
$kotlinx.coroutines.AbstractCoroutine.resumeWith @ AbstractCoroutine.kt:98
$kotlin.coroutines.CoroutineImpl.resumeWith @ composeApp.wasm:0x2f707e
$kotlinx.coroutines.DispatchedTask.run @ composeApp.wasm:0x37f7aa
$kotlinx.coroutines.MessageQueue.process @ composeApp.wasm:0x388360
$kotlinx.coroutines.WindowMessageQueue$process$ref.invoke @ composeApp.wasm:0x3895fa
$kotlinx.coroutines.WindowMessageQueue$process$ref.invoke @ composeApp.wasm:0x389604
$kotlin.js.__callFunction_(()->Unit) @ composeApp.wasm:0x2dcdd0
eval @ composeApp.uninstantiated.mjs:126
Promise.then (async)
eval @ composeApp.uninstantiated.mjs:4332
kotlinx.coroutines.__callJsClosure_(()->Unit) @ composeApp.uninstantiated.mjs:4333
$kotlinx.coroutines.__JsClosureToKotlinClosure_(()->Unit).invoke @ composeApp.wasm:0x3897f6
$kotlinx.coroutines.__JsClosureToKotlinClosure_(()->Unit).invoke @ composeApp.wasm:0x3897ff
$kotlinx.coroutines.WindowMessageQueue.schedule @ composeApp.wasm:0x389725
$kotlinx.coroutines.MessageQueue.enqueue @ composeApp.wasm:0x3882cd
$kotlinx.coroutines.WindowDispatcher.dispatch @ JSDispatcher.kt:56
$kotlinx.coroutines.JsMainDispatcher.dispatch @ composeApp.wasm:0x38889c
$kotlinx.coroutines.internal.resumeCancellableWith @ composeApp.wasm:0x37f056
$kotlinx.coroutines.intrinsics.startCoroutineCancellable @ Cancellable.kt:28
$kotlinx.coroutines.intrinsics.startCoroutineCancellable$default @ composeApp.wasm:0x38215e
$kotlinx.coroutines.CoroutineStart.invoke @ CoroutineStart.kt:88
$kotlinx.coroutines.AbstractCoroutine.start @ AbstractCoroutine.kt:124
$kotlinx.coroutines.launch @ Builders.common.kt:52
$kotlinx.coroutines.launch$default @ composeApp.wasm:0x35ca27
$androidx.compose.ui.platform.GlobalSnapshotManager.ensureStarted @ GlobalSnapshotManager.skiko.kt:43
$androidx.compose.ui.scene.BaseComposeScene.<init> @ BaseComposeScene.skiko.kt:117
$androidx.compose.ui.scene.MultiLayerComposeSceneImpl.<init> @ MultiLayerComposeScene.skiko.kt:110
$androidx.compose.ui.scene.MultiLayerComposeScene @ MultiLayerComposeScene.skiko.kt:94
$androidx.compose.ui.scene.MultiLayerComposeScene$default @ composeApp.wasm:0x4fd0b1
$androidx.compose.ui.native.ComposeLayer.<init> @ ComposeLayer.js.kt:58
$androidx.compose.ui.window.ComposeWindow.<init> @ ComposeWindow.web.kt:205
$androidx.compose.ui.window.ComposeViewport @ ComposeWindow.web.kt:526
$main @ main.kt:7
$kotlin.wasm.internal.mainCallsWrapper @ composeApp.wasm:0x5e9ca0
$_initialize @ composeApp.wasm:0x5e9cac
instantiate @ composeApp.uninstantiated.mjs:6016
await in instantiate (async)
eval @ composeApp.mjs:6
await in eval (async)
__webpack_require__.a @ composeApp.js:447
eval @ composeApp.mjs:1
./kotlin/composeApp.mjs @ composeApp.js:332
__webpack_require__ @ composeApp.js:381
(anonymous) @ composeApp.js:1520
(anonymous) @ composeApp.js:1523
webpackUniversalModuleDefinition @ composeApp.js:17
(anonymous) @ composeApp.js:18

```