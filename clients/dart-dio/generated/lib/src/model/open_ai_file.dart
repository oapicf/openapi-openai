//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'open_ai_file.g.dart';

/// The `File` object represents a document that has been uploaded to OpenAI.
///
/// Properties:
/// * [id] - The file identifier, which can be referenced in the API endpoints.
/// * [bytes] - The size of the file, in bytes.
/// * [createdAt] - The Unix timestamp (in seconds) for when the file was created.
/// * [filename] - The name of the file.
/// * [object] - The object type, which is always `file`.
/// * [purpose] - The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
/// * [status] - Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
/// * [statusDetails] - Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
@BuiltValue()
abstract class OpenAIFile implements Built<OpenAIFile, OpenAIFileBuilder> {
  /// The file identifier, which can be referenced in the API endpoints.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The size of the file, in bytes.
  @BuiltValueField(wireName: r'bytes')
  int get bytes;

  /// The Unix timestamp (in seconds) for when the file was created.
  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  /// The name of the file.
  @BuiltValueField(wireName: r'filename')
  String get filename;

  /// The object type, which is always `file`.
  @BuiltValueField(wireName: r'object')
  OpenAIFileObjectEnum get object;
  // enum objectEnum {  file,  };

  /// The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
  @BuiltValueField(wireName: r'purpose')
  OpenAIFilePurposeEnum get purpose;
  // enum purposeEnum {  assistants,  assistants_output,  batch,  batch_output,  fine-tune,  fine-tune-results,  vision,  };

  /// Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
  @Deprecated('status has been deprecated')
  @BuiltValueField(wireName: r'status')
  OpenAIFileStatusEnum get status;
  // enum statusEnum {  uploaded,  processed,  error,  };

  /// Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
  @Deprecated('statusDetails has been deprecated')
  @BuiltValueField(wireName: r'status_details')
  String? get statusDetails;

  OpenAIFile._();

  factory OpenAIFile([void updates(OpenAIFileBuilder b)]) = _$OpenAIFile;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OpenAIFileBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OpenAIFile> get serializer => _$OpenAIFileSerializer();
}

class _$OpenAIFileSerializer implements PrimitiveSerializer<OpenAIFile> {
  @override
  final Iterable<Type> types = const [OpenAIFile, _$OpenAIFile];

  @override
  final String wireName = r'OpenAIFile';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OpenAIFile object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'bytes';
    yield serializers.serialize(
      object.bytes,
      specifiedType: const FullType(int),
    );
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(int),
    );
    yield r'filename';
    yield serializers.serialize(
      object.filename,
      specifiedType: const FullType(String),
    );
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(OpenAIFileObjectEnum),
    );
    yield r'purpose';
    yield serializers.serialize(
      object.purpose,
      specifiedType: const FullType(OpenAIFilePurposeEnum),
    );
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(OpenAIFileStatusEnum),
    );
    if (object.statusDetails != null) {
      yield r'status_details';
      yield serializers.serialize(
        object.statusDetails,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OpenAIFile object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OpenAIFileBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'bytes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.bytes = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdAt = valueDes;
          break;
        case r'filename':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.filename = valueDes;
          break;
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OpenAIFileObjectEnum),
          ) as OpenAIFileObjectEnum;
          result.object = valueDes;
          break;
        case r'purpose':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OpenAIFilePurposeEnum),
          ) as OpenAIFilePurposeEnum;
          result.purpose = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OpenAIFileStatusEnum),
          ) as OpenAIFileStatusEnum;
          result.status = valueDes;
          break;
        case r'status_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.statusDetails = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OpenAIFile deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OpenAIFileBuilder();
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

class OpenAIFileObjectEnum extends EnumClass {

  /// The object type, which is always `file`.
  @BuiltValueEnumConst(wireName: r'file')
  static const OpenAIFileObjectEnum file = _$openAIFileObjectEnum_file;

  static Serializer<OpenAIFileObjectEnum> get serializer => _$openAIFileObjectEnumSerializer;

  const OpenAIFileObjectEnum._(String name): super(name);

  static BuiltSet<OpenAIFileObjectEnum> get values => _$openAIFileObjectEnumValues;
  static OpenAIFileObjectEnum valueOf(String name) => _$openAIFileObjectEnumValueOf(name);
}

class OpenAIFilePurposeEnum extends EnumClass {

  /// The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
  @BuiltValueEnumConst(wireName: r'assistants')
  static const OpenAIFilePurposeEnum assistants = _$openAIFilePurposeEnum_assistants;
  /// The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
  @BuiltValueEnumConst(wireName: r'assistants_output')
  static const OpenAIFilePurposeEnum assistantsOutput = _$openAIFilePurposeEnum_assistantsOutput;
  /// The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
  @BuiltValueEnumConst(wireName: r'batch')
  static const OpenAIFilePurposeEnum batch = _$openAIFilePurposeEnum_batch;
  /// The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
  @BuiltValueEnumConst(wireName: r'batch_output')
  static const OpenAIFilePurposeEnum batchOutput = _$openAIFilePurposeEnum_batchOutput;
  /// The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
  @BuiltValueEnumConst(wireName: r'fine-tune')
  static const OpenAIFilePurposeEnum fineTune = _$openAIFilePurposeEnum_fineTune;
  /// The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
  @BuiltValueEnumConst(wireName: r'fine-tune-results')
  static const OpenAIFilePurposeEnum fineTuneResults = _$openAIFilePurposeEnum_fineTuneResults;
  /// The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
  @BuiltValueEnumConst(wireName: r'vision')
  static const OpenAIFilePurposeEnum vision = _$openAIFilePurposeEnum_vision;

  static Serializer<OpenAIFilePurposeEnum> get serializer => _$openAIFilePurposeEnumSerializer;

  const OpenAIFilePurposeEnum._(String name): super(name);

  static BuiltSet<OpenAIFilePurposeEnum> get values => _$openAIFilePurposeEnumValues;
  static OpenAIFilePurposeEnum valueOf(String name) => _$openAIFilePurposeEnumValueOf(name);
}

class OpenAIFileStatusEnum extends EnumClass {

  /// Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
  @BuiltValueEnumConst(wireName: r'uploaded')
  static const OpenAIFileStatusEnum uploaded = _$openAIFileStatusEnum_uploaded;
  /// Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
  @BuiltValueEnumConst(wireName: r'processed')
  static const OpenAIFileStatusEnum processed = _$openAIFileStatusEnum_processed;
  /// Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
  @BuiltValueEnumConst(wireName: r'error')
  static const OpenAIFileStatusEnum error = _$openAIFileStatusEnum_error;

  static Serializer<OpenAIFileStatusEnum> get serializer => _$openAIFileStatusEnumSerializer;

  const OpenAIFileStatusEnum._(String name): super(name);

  static BuiltSet<OpenAIFileStatusEnum> get values => _$openAIFileStatusEnumValues;
  static OpenAIFileStatusEnum valueOf(String name) => _$openAIFileStatusEnumValueOf(name);
}

