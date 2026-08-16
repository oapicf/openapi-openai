//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_response_create_params_tools_inner.g.dart';

/// RealtimeResponseCreateParamsToolsInner
///
/// Properties:
/// * [type] - The type of the tool, i.e. `function`.
/// * [name] - The name of the function.
/// * [description] - The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
/// * [parameters] - Parameters of the function in JSON Schema.
@BuiltValue()
abstract class RealtimeResponseCreateParamsToolsInner implements Built<RealtimeResponseCreateParamsToolsInner, RealtimeResponseCreateParamsToolsInnerBuilder> {
  /// The type of the tool, i.e. `function`.
  @BuiltValueField(wireName: r'type')
  RealtimeResponseCreateParamsToolsInnerTypeEnum? get type;
  // enum typeEnum {  function,  };

  /// The name of the function.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
  @BuiltValueField(wireName: r'description')
  String? get description;

  /// Parameters of the function in JSON Schema.
  @BuiltValueField(wireName: r'parameters')
  JsonObject? get parameters;

  RealtimeResponseCreateParamsToolsInner._();

  factory RealtimeResponseCreateParamsToolsInner([void updates(RealtimeResponseCreateParamsToolsInnerBuilder b)]) = _$RealtimeResponseCreateParamsToolsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeResponseCreateParamsToolsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeResponseCreateParamsToolsInner> get serializer => _$RealtimeResponseCreateParamsToolsInnerSerializer();
}

class _$RealtimeResponseCreateParamsToolsInnerSerializer implements PrimitiveSerializer<RealtimeResponseCreateParamsToolsInner> {
  @override
  final Iterable<Type> types = const [RealtimeResponseCreateParamsToolsInner, _$RealtimeResponseCreateParamsToolsInner];

  @override
  final String wireName = r'RealtimeResponseCreateParamsToolsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeResponseCreateParamsToolsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(RealtimeResponseCreateParamsToolsInnerTypeEnum),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.parameters != null) {
      yield r'parameters';
      yield serializers.serialize(
        object.parameters,
        specifiedType: const FullType(JsonObject),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeResponseCreateParamsToolsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeResponseCreateParamsToolsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeResponseCreateParamsToolsInnerTypeEnum),
          ) as RealtimeResponseCreateParamsToolsInnerTypeEnum;
          result.type = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.description = valueDes;
          break;
        case r'parameters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(JsonObject),
          ) as JsonObject;
          result.parameters = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeResponseCreateParamsToolsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeResponseCreateParamsToolsInnerBuilder();
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

class RealtimeResponseCreateParamsToolsInnerTypeEnum extends EnumClass {

  /// The type of the tool, i.e. `function`.
  @BuiltValueEnumConst(wireName: r'function')
  static const RealtimeResponseCreateParamsToolsInnerTypeEnum function_ = _$realtimeResponseCreateParamsToolsInnerTypeEnum_function_;

  static Serializer<RealtimeResponseCreateParamsToolsInnerTypeEnum> get serializer => _$realtimeResponseCreateParamsToolsInnerTypeEnumSerializer;

  const RealtimeResponseCreateParamsToolsInnerTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeResponseCreateParamsToolsInnerTypeEnum> get values => _$realtimeResponseCreateParamsToolsInnerTypeEnumValues;
  static RealtimeResponseCreateParamsToolsInnerTypeEnum valueOf(String name) => _$realtimeResponseCreateParamsToolsInnerTypeEnumValueOf(name);
}

