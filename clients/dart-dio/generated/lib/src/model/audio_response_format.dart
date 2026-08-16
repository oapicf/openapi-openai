//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audio_response_format.g.dart';

class AudioResponseFormat extends EnumClass {

  /// The format of the output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
  @BuiltValueEnumConst(wireName: r'json')
  static const AudioResponseFormat json = _$json;
  /// The format of the output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
  @BuiltValueEnumConst(wireName: r'text')
  static const AudioResponseFormat text = _$text;
  /// The format of the output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
  @BuiltValueEnumConst(wireName: r'srt')
  static const AudioResponseFormat srt = _$srt;
  /// The format of the output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
  @BuiltValueEnumConst(wireName: r'verbose_json')
  static const AudioResponseFormat verboseJson = _$verboseJson;
  /// The format of the output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
  @BuiltValueEnumConst(wireName: r'vtt')
  static const AudioResponseFormat vtt = _$vtt;

  static Serializer<AudioResponseFormat> get serializer => _$audioResponseFormatSerializer;

  const AudioResponseFormat._(String name): super(name);

  static BuiltSet<AudioResponseFormat> get values => _$values;
  static AudioResponseFormat valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AudioResponseFormatMixin = Object with _$AudioResponseFormatMixin;

