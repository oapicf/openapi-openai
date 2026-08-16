//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/realtime_response_usage_input_token_details.dart';
import 'package:openapi/src/model/realtime_response_usage_output_token_details.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_response_usage.g.dart';

/// Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 
///
/// Properties:
/// * [totalTokens] - The total number of tokens in the Response including input and output  text and audio tokens. 
/// * [inputTokens] - The number of input tokens used in the Response, including text and  audio tokens. 
/// * [outputTokens] - The number of output tokens sent in the Response, including text and  audio tokens. 
/// * [inputTokenDetails] 
/// * [outputTokenDetails] 
@BuiltValue()
abstract class RealtimeResponseUsage implements Built<RealtimeResponseUsage, RealtimeResponseUsageBuilder> {
  /// The total number of tokens in the Response including input and output  text and audio tokens. 
  @BuiltValueField(wireName: r'total_tokens')
  int? get totalTokens;

  /// The number of input tokens used in the Response, including text and  audio tokens. 
  @BuiltValueField(wireName: r'input_tokens')
  int? get inputTokens;

  /// The number of output tokens sent in the Response, including text and  audio tokens. 
  @BuiltValueField(wireName: r'output_tokens')
  int? get outputTokens;

  @BuiltValueField(wireName: r'input_token_details')
  RealtimeResponseUsageInputTokenDetails? get inputTokenDetails;

  @BuiltValueField(wireName: r'output_token_details')
  RealtimeResponseUsageOutputTokenDetails? get outputTokenDetails;

  RealtimeResponseUsage._();

  factory RealtimeResponseUsage([void updates(RealtimeResponseUsageBuilder b)]) = _$RealtimeResponseUsage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeResponseUsageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeResponseUsage> get serializer => _$RealtimeResponseUsageSerializer();
}

class _$RealtimeResponseUsageSerializer implements PrimitiveSerializer<RealtimeResponseUsage> {
  @override
  final Iterable<Type> types = const [RealtimeResponseUsage, _$RealtimeResponseUsage];

  @override
  final String wireName = r'RealtimeResponseUsage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeResponseUsage object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.totalTokens != null) {
      yield r'total_tokens';
      yield serializers.serialize(
        object.totalTokens,
        specifiedType: const FullType(int),
      );
    }
    if (object.inputTokens != null) {
      yield r'input_tokens';
      yield serializers.serialize(
        object.inputTokens,
        specifiedType: const FullType(int),
      );
    }
    if (object.outputTokens != null) {
      yield r'output_tokens';
      yield serializers.serialize(
        object.outputTokens,
        specifiedType: const FullType(int),
      );
    }
    if (object.inputTokenDetails != null) {
      yield r'input_token_details';
      yield serializers.serialize(
        object.inputTokenDetails,
        specifiedType: const FullType(RealtimeResponseUsageInputTokenDetails),
      );
    }
    if (object.outputTokenDetails != null) {
      yield r'output_token_details';
      yield serializers.serialize(
        object.outputTokenDetails,
        specifiedType: const FullType(RealtimeResponseUsageOutputTokenDetails),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeResponseUsage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeResponseUsageBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'total_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.totalTokens = valueDes;
          break;
        case r'input_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.inputTokens = valueDes;
          break;
        case r'output_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.outputTokens = valueDes;
          break;
        case r'input_token_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeResponseUsageInputTokenDetails),
          ) as RealtimeResponseUsageInputTokenDetails;
          result.inputTokenDetails.replace(valueDes);
          break;
        case r'output_token_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeResponseUsageOutputTokenDetails),
          ) as RealtimeResponseUsageOutputTokenDetails;
          result.outputTokenDetails.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeResponseUsage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeResponseUsageBuilder();
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

