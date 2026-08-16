//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'vector_store_file_object_last_error.g.dart';

/// The last error associated with this vector store file. Will be `null` if there are no errors.
///
/// Properties:
/// * [code] - One of `server_error` or `rate_limit_exceeded`.
/// * [message] - A human-readable description of the error.
@BuiltValue()
abstract class VectorStoreFileObjectLastError implements Built<VectorStoreFileObjectLastError, VectorStoreFileObjectLastErrorBuilder> {
  /// One of `server_error` or `rate_limit_exceeded`.
  @BuiltValueField(wireName: r'code')
  VectorStoreFileObjectLastErrorCodeEnum get code;
  // enum codeEnum {  server_error,  unsupported_file,  invalid_file,  };

  /// A human-readable description of the error.
  @BuiltValueField(wireName: r'message')
  String get message;

  VectorStoreFileObjectLastError._();

  factory VectorStoreFileObjectLastError([void updates(VectorStoreFileObjectLastErrorBuilder b)]) = _$VectorStoreFileObjectLastError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(VectorStoreFileObjectLastErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<VectorStoreFileObjectLastError> get serializer => _$VectorStoreFileObjectLastErrorSerializer();
}

class _$VectorStoreFileObjectLastErrorSerializer implements PrimitiveSerializer<VectorStoreFileObjectLastError> {
  @override
  final Iterable<Type> types = const [VectorStoreFileObjectLastError, _$VectorStoreFileObjectLastError];

  @override
  final String wireName = r'VectorStoreFileObjectLastError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    VectorStoreFileObjectLastError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'code';
    yield serializers.serialize(
      object.code,
      specifiedType: const FullType(VectorStoreFileObjectLastErrorCodeEnum),
    );
    yield r'message';
    yield serializers.serialize(
      object.message,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    VectorStoreFileObjectLastError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required VectorStoreFileObjectLastErrorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VectorStoreFileObjectLastErrorCodeEnum),
          ) as VectorStoreFileObjectLastErrorCodeEnum;
          result.code = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.message = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  VectorStoreFileObjectLastError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = VectorStoreFileObjectLastErrorBuilder();
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

class VectorStoreFileObjectLastErrorCodeEnum extends EnumClass {

  /// One of `server_error` or `rate_limit_exceeded`.
  @BuiltValueEnumConst(wireName: r'server_error')
  static const VectorStoreFileObjectLastErrorCodeEnum serverError = _$vectorStoreFileObjectLastErrorCodeEnum_serverError;
  /// One of `server_error` or `rate_limit_exceeded`.
  @BuiltValueEnumConst(wireName: r'unsupported_file')
  static const VectorStoreFileObjectLastErrorCodeEnum unsupportedFile = _$vectorStoreFileObjectLastErrorCodeEnum_unsupportedFile;
  /// One of `server_error` or `rate_limit_exceeded`.
  @BuiltValueEnumConst(wireName: r'invalid_file')
  static const VectorStoreFileObjectLastErrorCodeEnum invalidFile = _$vectorStoreFileObjectLastErrorCodeEnum_invalidFile;

  static Serializer<VectorStoreFileObjectLastErrorCodeEnum> get serializer => _$vectorStoreFileObjectLastErrorCodeEnumSerializer;

  const VectorStoreFileObjectLastErrorCodeEnum._(String name): super(name);

  static BuiltSet<VectorStoreFileObjectLastErrorCodeEnum> get values => _$vectorStoreFileObjectLastErrorCodeEnumValues;
  static VectorStoreFileObjectLastErrorCodeEnum valueOf(String name) => _$vectorStoreFileObjectLastErrorCodeEnumValueOf(name);
}

