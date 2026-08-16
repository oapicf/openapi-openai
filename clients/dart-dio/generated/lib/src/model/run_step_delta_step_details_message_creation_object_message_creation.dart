//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_delta_step_details_message_creation_object_message_creation.g.dart';

/// RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
///
/// Properties:
/// * [messageId] - The ID of the message that was created by this run step.
@BuiltValue()
abstract class RunStepDeltaStepDetailsMessageCreationObjectMessageCreation implements Built<RunStepDeltaStepDetailsMessageCreationObjectMessageCreation, RunStepDeltaStepDetailsMessageCreationObjectMessageCreationBuilder> {
  /// The ID of the message that was created by this run step.
  @BuiltValueField(wireName: r'message_id')
  String? get messageId;

  RunStepDeltaStepDetailsMessageCreationObjectMessageCreation._();

  factory RunStepDeltaStepDetailsMessageCreationObjectMessageCreation([void updates(RunStepDeltaStepDetailsMessageCreationObjectMessageCreationBuilder b)]) = _$RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDeltaStepDetailsMessageCreationObjectMessageCreationBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDeltaStepDetailsMessageCreationObjectMessageCreation> get serializer => _$RunStepDeltaStepDetailsMessageCreationObjectMessageCreationSerializer();
}

class _$RunStepDeltaStepDetailsMessageCreationObjectMessageCreationSerializer implements PrimitiveSerializer<RunStepDeltaStepDetailsMessageCreationObjectMessageCreation> {
  @override
  final Iterable<Type> types = const [RunStepDeltaStepDetailsMessageCreationObjectMessageCreation, _$RunStepDeltaStepDetailsMessageCreationObjectMessageCreation];

  @override
  final String wireName = r'RunStepDeltaStepDetailsMessageCreationObjectMessageCreation';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDeltaStepDetailsMessageCreationObjectMessageCreation object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.messageId != null) {
      yield r'message_id';
      yield serializers.serialize(
        object.messageId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDeltaStepDetailsMessageCreationObjectMessageCreation object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDeltaStepDetailsMessageCreationObjectMessageCreationBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'message_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.messageId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunStepDeltaStepDetailsMessageCreationObjectMessageCreation deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDeltaStepDetailsMessageCreationObjectMessageCreationBuilder();
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

