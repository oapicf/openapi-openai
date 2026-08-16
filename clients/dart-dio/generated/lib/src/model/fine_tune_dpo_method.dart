//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/fine_tune_dpo_method_hyperparameters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'fine_tune_dpo_method.g.dart';

/// Configuration for the DPO fine-tuning method.
///
/// Properties:
/// * [hyperparameters] 
@BuiltValue()
abstract class FineTuneDPOMethod implements Built<FineTuneDPOMethod, FineTuneDPOMethodBuilder> {
  @BuiltValueField(wireName: r'hyperparameters')
  FineTuneDPOMethodHyperparameters? get hyperparameters;

  FineTuneDPOMethod._();

  factory FineTuneDPOMethod([void updates(FineTuneDPOMethodBuilder b)]) = _$FineTuneDPOMethod;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FineTuneDPOMethodBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FineTuneDPOMethod> get serializer => _$FineTuneDPOMethodSerializer();
}

class _$FineTuneDPOMethodSerializer implements PrimitiveSerializer<FineTuneDPOMethod> {
  @override
  final Iterable<Type> types = const [FineTuneDPOMethod, _$FineTuneDPOMethod];

  @override
  final String wireName = r'FineTuneDPOMethod';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FineTuneDPOMethod object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hyperparameters != null) {
      yield r'hyperparameters';
      yield serializers.serialize(
        object.hyperparameters,
        specifiedType: const FullType(FineTuneDPOMethodHyperparameters),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    FineTuneDPOMethod object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FineTuneDPOMethodBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'hyperparameters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FineTuneDPOMethodHyperparameters),
          ) as FineTuneDPOMethodHyperparameters;
          result.hyperparameters.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  FineTuneDPOMethod deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FineTuneDPOMethodBuilder();
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

