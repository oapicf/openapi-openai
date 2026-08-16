//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_response_usage_input_token_details.g.dart';

/// Details about the input tokens used in the Response.
///
/// Properties:
/// * [cachedTokens] - The number of cached tokens used in the Response.
/// * [textTokens] - The number of text tokens used in the Response.
/// * [audioTokens] - The number of audio tokens used in the Response.
@BuiltValue()
abstract class RealtimeResponseUsageInputTokenDetails implements Built<RealtimeResponseUsageInputTokenDetails, RealtimeResponseUsageInputTokenDetailsBuilder> {
  /// The number of cached tokens used in the Response.
  @BuiltValueField(wireName: r'cached_tokens')
  int? get cachedTokens;

  /// The number of text tokens used in the Response.
  @BuiltValueField(wireName: r'text_tokens')
  int? get textTokens;

  /// The number of audio tokens used in the Response.
  @BuiltValueField(wireName: r'audio_tokens')
  int? get audioTokens;

  RealtimeResponseUsageInputTokenDetails._();

  factory RealtimeResponseUsageInputTokenDetails([void updates(RealtimeResponseUsageInputTokenDetailsBuilder b)]) = _$RealtimeResponseUsageInputTokenDetails;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeResponseUsageInputTokenDetailsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeResponseUsageInputTokenDetails> get serializer => _$RealtimeResponseUsageInputTokenDetailsSerializer();
}

class _$RealtimeResponseUsageInputTokenDetailsSerializer implements PrimitiveSerializer<RealtimeResponseUsageInputTokenDetails> {
  @override
  final Iterable<Type> types = const [RealtimeResponseUsageInputTokenDetails, _$RealtimeResponseUsageInputTokenDetails];

  @override
  final String wireName = r'RealtimeResponseUsageInputTokenDetails';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeResponseUsageInputTokenDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cachedTokens != null) {
      yield r'cached_tokens';
      yield serializers.serialize(
        object.cachedTokens,
        specifiedType: const FullType(int),
      );
    }
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
    RealtimeResponseUsageInputTokenDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeResponseUsageInputTokenDetailsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cached_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.cachedTokens = valueDes;
          break;
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
  RealtimeResponseUsageInputTokenDetails deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeResponseUsageInputTokenDetailsBuilder();
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

