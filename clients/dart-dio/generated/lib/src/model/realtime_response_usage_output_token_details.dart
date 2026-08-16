//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_response_usage_output_token_details.g.dart';

/// Details about the output tokens used in the Response.
///
/// Properties:
/// * [textTokens] - The number of text tokens used in the Response.
/// * [audioTokens] - The number of audio tokens used in the Response.
@BuiltValue()
abstract class RealtimeResponseUsageOutputTokenDetails implements Built<RealtimeResponseUsageOutputTokenDetails, RealtimeResponseUsageOutputTokenDetailsBuilder> {
  /// The number of text tokens used in the Response.
  @BuiltValueField(wireName: r'text_tokens')
  int? get textTokens;

  /// The number of audio tokens used in the Response.
  @BuiltValueField(wireName: r'audio_tokens')
  int? get audioTokens;

  RealtimeResponseUsageOutputTokenDetails._();

  factory RealtimeResponseUsageOutputTokenDetails([void updates(RealtimeResponseUsageOutputTokenDetailsBuilder b)]) = _$RealtimeResponseUsageOutputTokenDetails;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeResponseUsageOutputTokenDetailsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeResponseUsageOutputTokenDetails> get serializer => _$RealtimeResponseUsageOutputTokenDetailsSerializer();
}

class _$RealtimeResponseUsageOutputTokenDetailsSerializer implements PrimitiveSerializer<RealtimeResponseUsageOutputTokenDetails> {
  @override
  final Iterable<Type> types = const [RealtimeResponseUsageOutputTokenDetails, _$RealtimeResponseUsageOutputTokenDetails];

  @override
  final String wireName = r'RealtimeResponseUsageOutputTokenDetails';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeResponseUsageOutputTokenDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.textTokens != null) {
      yield r'text_tokens';
      yield serializers.serialize(
        object.textTokens,
        specifiedType: const FullType(int),
      );
    }
    if (object.audioTokens != null) {
      yield r'audio_tokens';
      yield serializers.serialize(
        object.audioTokens,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeResponseUsageOutputTokenDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeResponseUsageOutputTokenDetailsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'text_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.textTokens = valueDes;
          break;
        case r'audio_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.audioTokens = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeResponseUsageOutputTokenDetails deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeResponseUsageOutputTokenDetailsBuilder();
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

