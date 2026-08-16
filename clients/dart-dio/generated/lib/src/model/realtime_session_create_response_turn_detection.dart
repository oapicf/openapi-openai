//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_session_create_response_turn_detection.g.dart';

/// Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
///
/// Properties:
/// * [type] - Type of turn detection, only `server_vad` is currently supported. 
/// * [threshold] - Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
/// * [prefixPaddingMs] - Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
/// * [silenceDurationMs] - Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
@BuiltValue()
abstract class RealtimeSessionCreateResponseTurnDetection implements Built<RealtimeSessionCreateResponseTurnDetection, RealtimeSessionCreateResponseTurnDetectionBuilder> {
  /// Type of turn detection, only `server_vad` is currently supported. 
  @BuiltValueField(wireName: r'type')
  String? get type;

  /// Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
  @BuiltValueField(wireName: r'threshold')
  num? get threshold;

  /// Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
  @BuiltValueField(wireName: r'prefix_padding_ms')
  int? get prefixPaddingMs;

  /// Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
  @BuiltValueField(wireName: r'silence_duration_ms')
  int? get silenceDurationMs;

  RealtimeSessionCreateResponseTurnDetection._();

  factory RealtimeSessionCreateResponseTurnDetection([void updates(RealtimeSessionCreateResponseTurnDetectionBuilder b)]) = _$RealtimeSessionCreateResponseTurnDetection;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeSessionCreateResponseTurnDetectionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeSessionCreateResponseTurnDetection> get serializer => _$RealtimeSessionCreateResponseTurnDetectionSerializer();
}

class _$RealtimeSessionCreateResponseTurnDetectionSerializer implements PrimitiveSerializer<RealtimeSessionCreateResponseTurnDetection> {
  @override
  final Iterable<Type> types = const [RealtimeSessionCreateResponseTurnDetection, _$RealtimeSessionCreateResponseTurnDetection];

  @override
  final String wireName = r'RealtimeSessionCreateResponseTurnDetection';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeSessionCreateResponseTurnDetection object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(String),
      );
    }
    if (object.threshold != null) {
      yield r'threshold';
      yield serializers.serialize(
        object.threshold,
        specifiedType: const FullType(num),
      );
    }
    if (object.prefixPaddingMs != null) {
      yield r'prefix_padding_ms';
      yield serializers.serialize(
        object.prefixPaddingMs,
        specifiedType: const FullType(int),
      );
    }
    if (object.silenceDurationMs != null) {
      yield r'silence_duration_ms';
      yield serializers.serialize(
        object.silenceDurationMs,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeSessionCreateResponseTurnDetection object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeSessionCreateResponseTurnDetectionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.type = valueDes;
          break;
        case r'threshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.threshold = valueDes;
          break;
        case r'prefix_padding_ms':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.prefixPaddingMs = valueDes;
          break;
        case r'silence_duration_ms':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.silenceDurationMs = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeSessionCreateResponseTurnDetection deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeSessionCreateResponseTurnDetectionBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

