//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/batch_errors_data_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'batch_errors.g.dart';

/// BatchErrors
///
/// Properties:
/// * [object] - The object type, which is always `list`.
/// * [data] 
@BuiltValue()
abstract class BatchErrors implements Built<BatchErrors, BatchErrorsBuilder> {
  /// The object type, which is always `list`.
  @BuiltValueField(wireName: r'object')
  String? get object;

  @BuiltValueField(wireName: r'data')
  BuiltList<BatchErrorsDataInner>? get data;

  BatchErrors._();

  factory BatchErrors([void updates(BatchErrorsBuilder b)]) = _$BatchErrors;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BatchErrorsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BatchErrors> get serializer => _$BatchErrorsSerializer();
}

class _$BatchErrorsSerializer implements PrimitiveSerializer<BatchErrors> {
  @override
  final Iterable<Type> types = const [BatchErrors, _$BatchErrors];

  @override
  final String wireName = r'BatchErrors';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BatchErrors object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.object != null) {
      yield r'object';
      yield serializers.serialize(
        object.object,
        specifiedType: const FullType(String),
      );
    }
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(BuiltList, [FullType(BatchErrorsDataInner)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BatchErrors object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BatchErrorsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.object = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(BatchErrorsDataInner)]),
          ) as BuiltList<BatchErrorsDataInner>;
          result.data.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BatchErrors deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BatchErrorsBuilder();
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

