//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_details_message_creation_object_message_creation.g.dart';

/// RunStepDetailsMessageCreationObjectMessageCreation
///
/// Properties:
/// * [messageId] - The ID of the message that was created by this run step.
@BuiltValue()
abstract class RunStepDetailsMessageCreationObjectMessageCreation implements Built<RunStepDetailsMessageCreationObjectMessageCreation, RunStepDetailsMessageCreationObjectMessageCreationBuilder> {
  /// The ID of the message that was created by this run step.
  @BuiltValueField(wireName: r'message_id')
  String get messageId;

  RunStepDetailsMessageCreationObjectMessageCreation._();

  factory RunStepDetailsMessageCreationObjectMessageCreation([void updates(RunStepDetailsMessageCreationObjectMessageCreationBuilder b)]) = _$RunStepDetailsMessageCreationObjectMessageCreation;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDetailsMessageCreationObjectMessageCreationBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDetailsMessageCreationObjectMessageCreation> get serializer => _$RunStepDetailsMessageCreationObjectMessageCreationSerializer();
}

class _$RunStepDetailsMessageCreationObjectMessageCreationSerializer implements PrimitiveSerializer<RunStepDetailsMessageCreationObjectMessageCreation> {
  @override
  final Iterable<Type> types = const [RunStepDetailsMessageCreationObjectMessageCreation, _$RunStepDetailsMessageCreationObjectMessageCreation];

  @override
  final String wireName = r'RunStepDetailsMessageCreationObjectMessageCreation';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDetailsMessageCreationObjectMessageCreation object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'message_id';
    yield serializers.serialize(
      object.messageId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDetailsMessageCreationObjectMessageCreation object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDetailsMessageCreationObjectMessageCreationBuilder result,
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
  RunStepDetailsMessageCreationObjectMessageCreation deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDetailsMessageCreationObjectMessageCreationBuilder();
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

