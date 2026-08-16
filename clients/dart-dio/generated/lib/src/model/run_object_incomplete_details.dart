//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_object_incomplete_details.g.dart';

/// Details on why the run is incomplete. Will be `null` if the run is not incomplete.
///
/// Properties:
/// * [reason] - The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
@BuiltValue()
abstract class RunObjectIncompleteDetails implements Built<RunObjectIncompleteDetails, RunObjectIncompleteDetailsBuilder> {
  /// The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
  @BuiltValueField(wireName: r'reason')
  RunObjectIncompleteDetailsReasonEnum? get reason;
  // enum reasonEnum {  max_completion_tokens,  max_prompt_tokens,  };

  RunObjectIncompleteDetails._();

  factory RunObjectIncompleteDetails([void updates(RunObjectIncompleteDetailsBuilder b)]) = _$RunObjectIncompleteDetails;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunObjectIncompleteDetailsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunObjectIncompleteDetails> get serializer => _$RunObjectIncompleteDetailsSerializer();
}

class _$RunObjectIncompleteDetailsSerializer implements PrimitiveSerializer<RunObjectIncompleteDetails> {
  @override
  final Iterable<Type> types = const [RunObjectIncompleteDetails, _$RunObjectIncompleteDetails];

  @override
  final String wireName = r'RunObjectIncompleteDetails';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunObjectIncompleteDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.reason != null) {
      yield r'reason';
      yield serializers.serialize(
        object.reason,
        specifiedType: const FullType(RunObjectIncompleteDetailsReasonEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RunObjectIncompleteDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunObjectIncompleteDetailsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'reason':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunObjectIncompleteDetailsReasonEnum),
          ) as RunObjectIncompleteDetailsReasonEnum;
          result.reason = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunObjectIncompleteDetails deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunObjectIncompleteDetailsBuilder();
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

class RunObjectIncompleteDetailsReasonEnum extends EnumClass {

  /// The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
  @BuiltValueEnumConst(wireName: r'max_completion_tokens')
  static const RunObjectIncompleteDetailsReasonEnum maxCompletionTokens = _$runObjectIncompleteDetailsReasonEnum_maxCompletionTokens;
  /// The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
  @BuiltValueEnumConst(wireName: r'max_prompt_tokens')
  static const RunObjectIncompleteDetailsReasonEnum maxPromptTokens = _$runObjectIncompleteDetailsReasonEnum_maxPromptTokens;

  static Serializer<RunObjectIncompleteDetailsReasonEnum> get serializer => _$runObjectIncompleteDetailsReasonEnumSerializer;

  const RunObjectIncompleteDetailsReasonEnum._(String name): super(name);

  static BuiltSet<RunObjectIncompleteDetailsReasonEnum> get values => _$runObjectIncompleteDetailsReasonEnumValues;
  static RunObjectIncompleteDetailsReasonEnum valueOf(String name) => _$runObjectIncompleteDetailsReasonEnumValueOf(name);
}

