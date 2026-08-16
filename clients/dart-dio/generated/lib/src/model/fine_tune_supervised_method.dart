//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/fine_tune_supervised_method_hyperparameters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'fine_tune_supervised_method.g.dart';

/// Configuration for the supervised fine-tuning method.
///
/// Properties:
/// * [hyperparameters] 
@BuiltValue()
abstract class FineTuneSupervisedMethod implements Built<FineTuneSupervisedMethod, FineTuneSupervisedMethodBuilder> {
  @BuiltValueField(wireName: r'hyperparameters')
  FineTuneSupervisedMethodHyperparameters? get hyperparameters;

  FineTuneSupervisedMethod._();

  factory FineTuneSupervisedMethod([void updates(FineTuneSupervisedMethodBuilder b)]) = _$FineTuneSupervisedMethod;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FineTuneSupervisedMethodBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FineTuneSupervisedMethod> get serializer => _$FineTuneSupervisedMethodSerializer();
}

class _$FineTuneSupervisedMethodSerializer implements PrimitiveSerializer<FineTuneSupervisedMethod> {
  @override
  final Iterable<Type> types = const [FineTuneSupervisedMethod, _$FineTuneSupervisedMethod];

  @override
  final String wireName = r'FineTuneSupervisedMethod';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FineTuneSupervisedMethod object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hyperparameters != null) {
      yield r'hyperparameters';
      yield serializers.serialize(
        object.hyperparameters,
        specifiedType: const FullType(FineTuneSupervisedMethodHyperparameters),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    FineTuneSupervisedMethod object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FineTuneSupervisedMethodBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'hyperparameters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FineTuneSupervisedMethodHyperparameters),
          ) as FineTuneSupervisedMethodHyperparameters;
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
  FineTuneSupervisedMethod deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FineTuneSupervisedMethodBuilder();
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

