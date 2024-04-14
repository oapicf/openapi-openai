require 'json'


MyApp.add_route('POST', '/v1/audio/speech', {
  "resourcePath" => "/Audio",
  "summary" => "Generates audio from the input text.",
  "nickname" => "create_speech",
  "responseClass" => "File",
  "endpoint" => "/audio/speech",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateSpeechRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/audio/transcriptions', {
  "resourcePath" => "/Audio",
  "summary" => "Transcribes audio into the input language.",
  "nickname" => "create_transcription",
  "responseClass" => "createTranscription_200_response",
  "endpoint" => "/audio/transcriptions",
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/audio/translations', {
  "resourcePath" => "/Audio",
  "summary" => "Translates audio into English.",
  "nickname" => "create_translation",
  "responseClass" => "createTranslation_200_response",
  "endpoint" => "/audio/translations",
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

