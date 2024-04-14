{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Audio where

import           Import


-- | Generates audio from the input text.
--
-- operationId: createSpeech
postAudioSpeechR :: Handler Value
postAudioSpeechR = notImplemented

-- | Transcribes audio into the input language.
--
-- operationId: createTranscription
postAudioTranscriptionsR :: Handler Value
postAudioTranscriptionsR = notImplemented

-- | Translates audio into English.
--
-- operationId: createTranslation
postAudioTranslationsR :: Handler Value
postAudioTranslationsR = notImplemented
