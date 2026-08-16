//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/realtime_response_status_details_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_response_status_details.g.dart';

/// Additional details about the status.
///
/// Properties:
/// * [type] - The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
/// * [reason] - The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
/// * [error] 
@BuiltValue()
abstract class RealtimeResponseStatusDetails implements Built<RealtimeResponseStatusDetails, RealtimeResponseStatusDetailsBuilder> {
  /// The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
  @BuiltValueField(wireName: r'type')
  RealtimeResponseStatusDetailsTypeEnum? get type;
  // enum typeEnum {  completed,  cancelled,  failed,  incomplete,  };

  /// The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
  @BuiltValueField(wireName: r'reason')
  RealtimeResponseStatusDetailsReasonEnum? get reason;
  // enum reasonEnum {  turn_detected,  client_cancelled,  max_output_tokens,  content_filter,  };

  @BuiltValueField(wireName: r'error')
  RealtimeResponseStatusDetailsError? get error;

  RealtimeResponseStatusDetails._();

  factory RealtimeResponseStatusDetails([void updates(RealtimeResponseStatusDetailsBuilder b)]) = _$RealtimeResponseStatusDetails;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeResponseStatusDetailsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeResponseStatusDetails> get serializer => _$RealtimeResponseStatusDetailsSerializer();
}

class _$RealtimeResponseStatusDetailsSerializer implements PrimitiveSerializer<RealtimeResponseStatusDetails> {
  @override
  final Iterable<Type> types = const [RealtimeResponseStatusDetails, _$RealtimeResponseStatusDetails];

  @override
  final String wireName = r'RealtimeResponseStatusDetails';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeResponseStatusDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(RealtimeResponseStatusDetailsTypeEnum),
      );
    }
    if (object.reason != null) {
      yield r'reason';
      yield serializers.serialize(
        object.reason,
        specifiedType: const FullType(RealtimeResponseStatusDetailsReasonEnum),
      );
    }
    if (object.error != null) {
      yield r'error';
      yield serializers.serialize(
        object.error,
        specifiedType: const FullType(RealtimeResponseStatusDetailsError),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeResponseStatusDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeResponseStatusDetailsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeResponseStatusDetailsTypeEnum),
          ) as RealtimeResponseStatusDetailsTypeEnum;
          result.type = valueDes;
          break;
        case r'reason':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeResponseStatusDetailsReasonEnum),
          ) as RealtimeResponseStatusDetailsReasonEnum;
          result.reason = valueDes;
          break;
        case r'error':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeResponseStatusDetailsError),
          ) as RealtimeResponseStatusDetailsError;
          result.error.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeResponseStatusDetails deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeResponseStatusDetailsBuilder();
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

class RealtimeResponseStatusDetailsTypeEnum extends EnumClass {

  /// The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
  @BuiltValueEnumConst(wireName: r'completed')
  static const RealtimeResponseStatusDetailsTypeEnum completed = _$realtimeResponseStatusDetailsTypeEnum_completed;
  /// The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
  @BuiltValueEnumConst(wireName: r'cancelled')
  static const RealtimeResponseStatusDetailsTypeEnum cancelled = _$realtimeResponseStatusDetailsTypeEnum_cancelled;
  /// The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
  @BuiltValueEnumConst(wireName: r'failed')
  static const RealtimeResponseStatusDetailsTypeEnum failed = _$realtimeResponseStatusDetailsTypeEnum_failed;
  /// The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
  @BuiltValueEnumConst(wireName: r'incomplete')
  static const RealtimeResponseStatusDetailsTypeEnum incomplete = _$realtimeResponseStatusDetailsTypeEnum_incomplete;

  static Serializer<RealtimeResponseStatusDetailsTypeEnum> get serializer => _$realtimeResponseStatusDetailsTypeEnumSerializer;

  const RealtimeResponseStatusDetailsTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeResponseStatusDetailsTypeEnum> get values => _$realtimeResponseStatusDetailsTypeEnumValues;
  static RealtimeResponseStatusDetailsTypeEnum valueOf(String name) => _$realtimeResponseStatusDetailsTypeEnumValueOf(name);
}

class RealtimeResponseStatusDetailsReasonEnum extends EnumClass {

  /// The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
  @BuiltValueEnumConst(wireName: r'turn_detected')
  static const RealtimeResponseStatusDetailsReasonEnum turnDetected = _$realtimeResponseStatusDetailsReasonEnum_turnDetected;
  /// The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
  @BuiltValueEnumConst(wireName: r'client_cancelled')
  static const RealtimeResponseStatusDetailsReasonEnum clientCancelled = _$realtimeResponseStatusDetailsReasonEnum_clientCancelled;
  /// The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
  @BuiltValueEnumConst(wireName: r'max_output_tokens')
  static const RealtimeResponseStatusDetailsReasonEnum maxOutputTokens = _$realtimeResponseStatusDetailsReasonEnum_maxOutputTokens;
  /// The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
  @BuiltValueEnumConst(wireName: r'content_filter')
  static const RealtimeResponseStatusDetailsReasonEnum contentFilter = _$realtimeResponseStatusDetailsReasonEnum_contentFilter;

  static Serializer<RealtimeResponseStatusDetailsReasonEnum> get serializer => _$realtimeResponseStatusDetailsReasonEnumSerializer;

  const RealtimeResponseStatusDetailsReasonEnum._(String name): super(name);

  static BuiltSet<RealtimeResponseStatusDetailsReasonEnum> get values => _$realtimeResponseStatusDetailsReasonEnumValues;
  static RealtimeResponseStatusDetailsReasonEnum valueOf(String name) => _$realtimeResponseStatusDetailsReasonEnumValueOf(name);
}

