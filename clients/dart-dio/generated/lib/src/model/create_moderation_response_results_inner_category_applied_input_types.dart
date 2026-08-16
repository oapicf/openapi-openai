//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_moderation_response_results_inner_category_applied_input_types.g.dart';

/// A list of the categories along with the input type(s) that the score applies to.
///
/// Properties:
/// * [hate] - The applied input type(s) for the category 'hate'.
/// * [hateSlashThreatening] - The applied input type(s) for the category 'hate/threatening'.
/// * [harassment] - The applied input type(s) for the category 'harassment'.
/// * [harassmentSlashThreatening] - The applied input type(s) for the category 'harassment/threatening'.
/// * [illicit] - The applied input type(s) for the category 'illicit'.
/// * [illicitSlashViolent] - The applied input type(s) for the category 'illicit/violent'.
/// * [selfHarm] - The applied input type(s) for the category 'self-harm'.
/// * [selfHarmSlashIntent] - The applied input type(s) for the category 'self-harm/intent'.
/// * [selfHarmSlashInstructions] - The applied input type(s) for the category 'self-harm/instructions'.
/// * [sexual] - The applied input type(s) for the category 'sexual'.
/// * [sexualSlashMinors] - The applied input type(s) for the category 'sexual/minors'.
/// * [violence] - The applied input type(s) for the category 'violence'.
/// * [violenceSlashGraphic] - The applied input type(s) for the category 'violence/graphic'.
@BuiltValue()
abstract class CreateModerationResponseResultsInnerCategoryAppliedInputTypes implements Built<CreateModerationResponseResultsInnerCategoryAppliedInputTypes, CreateModerationResponseResultsInnerCategoryAppliedInputTypesBuilder> {
  /// The applied input type(s) for the category 'hate'.
  @BuiltValueField(wireName: r'hate')
  BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum> get hate;
  // enum hateEnum {  text,  };

  /// The applied input type(s) for the category 'hate/threatening'.
  @BuiltValueField(wireName: r'hate/threatening')
  BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum> get hateSlashThreatening;
  // enum hateSlashThreateningEnum {  text,  };

  /// The applied input type(s) for the category 'harassment'.
  @BuiltValueField(wireName: r'harassment')
  BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum> get harassment;
  // enum harassmentEnum {  text,  };

  /// The applied input type(s) for the category 'harassment/threatening'.
  @BuiltValueField(wireName: r'harassment/threatening')
  BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum> get harassmentSlashThreatening;
  // enum harassmentSlashThreateningEnum {  text,  };

  /// The applied input type(s) for the category 'illicit'.
  @BuiltValueField(wireName: r'illicit')
  BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum> get illicit;
  // enum illicitEnum {  text,  };

  /// The applied input type(s) for the category 'illicit/violent'.
  @BuiltValueField(wireName: r'illicit/violent')
  BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum> get illicitSlashViolent;
  // enum illicitSlashViolentEnum {  text,  };

  /// The applied input type(s) for the category 'self-harm'.
  @BuiltValueField(wireName: r'self-harm')
  BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum> get selfHarm;
  // enum selfHarmEnum {  text,  image,  };

  /// The applied input type(s) for the category 'self-harm/intent'.
  @BuiltValueField(wireName: r'self-harm/intent')
  BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum> get selfHarmSlashIntent;
  // enum selfHarmSlashIntentEnum {  text,  image,  };

  /// The applied input type(s) for the category 'self-harm/instructions'.
  @BuiltValueField(wireName: r'self-harm/instructions')
  BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum> get selfHarmSlashInstructions;
  // enum selfHarmSlashInstructionsEnum {  text,  image,  };

  /// The applied input type(s) for the category 'sexual'.
  @BuiltValueField(wireName: r'sexual')
  BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum> get sexual;
  // enum sexualEnum {  text,  image,  };

  /// The applied input type(s) for the category 'sexual/minors'.
  @BuiltValueField(wireName: r'sexual/minors')
  BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum> get sexualSlashMinors;
  // enum sexualSlashMinorsEnum {  text,  };

  /// The applied input type(s) for the category 'violence'.
  @BuiltValueField(wireName: r'violence')
  BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum> get violence;
  // enum violenceEnum {  text,  image,  };

  /// The applied input type(s) for the category 'violence/graphic'.
  @BuiltValueField(wireName: r'violence/graphic')
  BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum> get violenceSlashGraphic;
  // enum violenceSlashGraphicEnum {  text,  image,  };

  CreateModerationResponseResultsInnerCategoryAppliedInputTypes._();

  factory CreateModerationResponseResultsInnerCategoryAppliedInputTypes([void updates(CreateModerationResponseResultsInnerCategoryAppliedInputTypesBuilder b)]) = _$CreateModerationResponseResultsInnerCategoryAppliedInputTypes;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateModerationResponseResultsInnerCategoryAppliedInputTypesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateModerationResponseResultsInnerCategoryAppliedInputTypes> get serializer => _$CreateModerationResponseResultsInnerCategoryAppliedInputTypesSerializer();
}

class _$CreateModerationResponseResultsInnerCategoryAppliedInputTypesSerializer implements PrimitiveSerializer<CreateModerationResponseResultsInnerCategoryAppliedInputTypes> {
  @override
  final Iterable<Type> types = const [CreateModerationResponseResultsInnerCategoryAppliedInputTypes, _$CreateModerationResponseResultsInnerCategoryAppliedInputTypes];

  @override
  final String wireName = r'CreateModerationResponseResultsInnerCategoryAppliedInputTypes';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateModerationResponseResultsInnerCategoryAppliedInputTypes object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'hate';
    yield serializers.serialize(
      object.hate,
      specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum)]),
    );
    yield r'hate/threatening';
    yield serializers.serialize(
      object.hateSlashThreatening,
      specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum)]),
    );
    yield r'harassment';
    yield serializers.serialize(
      object.harassment,
      specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum)]),
    );
    yield r'harassment/threatening';
    yield serializers.serialize(
      object.harassmentSlashThreatening,
      specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum)]),
    );
    yield r'illicit';
    yield serializers.serialize(
      object.illicit,
      specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum)]),
    );
    yield r'illicit/violent';
    yield serializers.serialize(
      object.illicitSlashViolent,
      specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum)]),
    );
    yield r'self-harm';
    yield serializers.serialize(
      object.selfHarm,
      specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum)]),
    );
    yield r'self-harm/intent';
    yield serializers.serialize(
      object.selfHarmSlashIntent,
      specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum)]),
    );
    yield r'self-harm/instructions';
    yield serializers.serialize(
      object.selfHarmSlashInstructions,
      specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum)]),
    );
    yield r'sexual';
    yield serializers.serialize(
      object.sexual,
      specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum)]),
    );
    yield r'sexual/minors';
    yield serializers.serialize(
      object.sexualSlashMinors,
      specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum)]),
    );
    yield r'violence';
    yield serializers.serialize(
      object.violence,
      specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum)]),
    );
    yield r'violence/graphic';
    yield serializers.serialize(
      object.violenceSlashGraphic,
      specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateModerationResponseResultsInnerCategoryAppliedInputTypes object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateModerationResponseResultsInnerCategoryAppliedInputTypesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'hate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum)]),
          ) as BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum>;
          result.hate.replace(valueDes);
          break;
        case r'hate/threatening':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum)]),
          ) as BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum>;
          result.hateSlashThreatening.replace(valueDes);
          break;
        case r'harassment':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum)]),
          ) as BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum>;
          result.harassment.replace(valueDes);
          break;
        case r'harassment/threatening':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum)]),
          ) as BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum>;
          result.harassmentSlashThreatening.replace(valueDes);
          break;
        case r'illicit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum)]),
          ) as BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum>;
          result.illicit.replace(valueDes);
          break;
        case r'illicit/violent':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum)]),
          ) as BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum>;
          result.illicitSlashViolent.replace(valueDes);
          break;
        case r'self-harm':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum)]),
          ) as BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum>;
          result.selfHarm.replace(valueDes);
          break;
        case r'self-harm/intent':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum)]),
          ) as BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum>;
          result.selfHarmSlashIntent.replace(valueDes);
          break;
        case r'self-harm/instructions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum)]),
          ) as BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum>;
          result.selfHarmSlashInstructions.replace(valueDes);
          break;
        case r'sexual':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum)]),
          ) as BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum>;
          result.sexual.replace(valueDes);
          break;
        case r'sexual/minors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum)]),
          ) as BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum>;
          result.sexualSlashMinors.replace(valueDes);
          break;
        case r'violence':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum)]),
          ) as BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum>;
          result.violence.replace(valueDes);
          break;
        case r'violence/graphic':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum)]),
          ) as BuiltList<CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum>;
          result.violenceSlashGraphic.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateModerationResponseResultsInnerCategoryAppliedInputTypes deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateModerationResponseResultsInnerCategoryAppliedInputTypesBuilder();
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

class CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'text')
  static const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum text = _$createModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum_text;

  static Serializer<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum> get serializer => _$createModerationResponseResultsInnerCategoryAppliedInputTypesHateEnumSerializer;

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum._(String name): super(name);

  static BuiltSet<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum> get values => _$createModerationResponseResultsInnerCategoryAppliedInputTypesHateEnumValues;
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum valueOf(String name) => _$createModerationResponseResultsInnerCategoryAppliedInputTypesHateEnumValueOf(name);
}

class CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'text')
  static const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum text = _$createModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum_text;

  static Serializer<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum> get serializer => _$createModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnumSerializer;

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum._(String name): super(name);

  static BuiltSet<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum> get values => _$createModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnumValues;
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum valueOf(String name) => _$createModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnumValueOf(name);
}

class CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'text')
  static const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum text = _$createModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum_text;

  static Serializer<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum> get serializer => _$createModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnumSerializer;

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum._(String name): super(name);

  static BuiltSet<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum> get values => _$createModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnumValues;
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum valueOf(String name) => _$createModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnumValueOf(name);
}

class CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'text')
  static const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum text = _$createModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum_text;

  static Serializer<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum> get serializer => _$createModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnumSerializer;

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum._(String name): super(name);

  static BuiltSet<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum> get values => _$createModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnumValues;
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum valueOf(String name) => _$createModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnumValueOf(name);
}

class CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'text')
  static const CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum text = _$createModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum_text;

  static Serializer<CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum> get serializer => _$createModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnumSerializer;

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum._(String name): super(name);

  static BuiltSet<CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum> get values => _$createModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnumValues;
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum valueOf(String name) => _$createModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnumValueOf(name);
}

class CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'text')
  static const CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum text = _$createModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum_text;

  static Serializer<CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum> get serializer => _$createModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnumSerializer;

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum._(String name): super(name);

  static BuiltSet<CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum> get values => _$createModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnumValues;
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum valueOf(String name) => _$createModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnumValueOf(name);
}

class CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'text')
  static const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum text = _$createModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum_text;
  @BuiltValueEnumConst(wireName: r'image')
  static const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum image = _$createModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum_image;

  static Serializer<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum> get serializer => _$createModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnumSerializer;

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum._(String name): super(name);

  static BuiltSet<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum> get values => _$createModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnumValues;
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum valueOf(String name) => _$createModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnumValueOf(name);
}

class CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'text')
  static const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum text = _$createModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum_text;
  @BuiltValueEnumConst(wireName: r'image')
  static const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum image = _$createModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum_image;

  static Serializer<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum> get serializer => _$createModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnumSerializer;

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum._(String name): super(name);

  static BuiltSet<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum> get values => _$createModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnumValues;
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum valueOf(String name) => _$createModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnumValueOf(name);
}

class CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'text')
  static const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum text = _$createModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum_text;
  @BuiltValueEnumConst(wireName: r'image')
  static const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum image = _$createModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum_image;

  static Serializer<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum> get serializer => _$createModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnumSerializer;

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum._(String name): super(name);

  static BuiltSet<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum> get values => _$createModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnumValues;
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum valueOf(String name) => _$createModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnumValueOf(name);
}

class CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'text')
  static const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum text = _$createModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum_text;
  @BuiltValueEnumConst(wireName: r'image')
  static const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum image = _$createModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum_image;

  static Serializer<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum> get serializer => _$createModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnumSerializer;

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum._(String name): super(name);

  static BuiltSet<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum> get values => _$createModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnumValues;
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum valueOf(String name) => _$createModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnumValueOf(name);
}

class CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'text')
  static const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum text = _$createModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum_text;

  static Serializer<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum> get serializer => _$createModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnumSerializer;

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum._(String name): super(name);

  static BuiltSet<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum> get values => _$createModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnumValues;
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum valueOf(String name) => _$createModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnumValueOf(name);
}

class CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'text')
  static const CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum text = _$createModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum_text;
  @BuiltValueEnumConst(wireName: r'image')
  static const CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum image = _$createModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum_image;

  static Serializer<CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum> get serializer => _$createModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnumSerializer;

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum._(String name): super(name);

  static BuiltSet<CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum> get values => _$createModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnumValues;
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum valueOf(String name) => _$createModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnumValueOf(name);
}

class CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'text')
  static const CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum text = _$createModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum_text;
  @BuiltValueEnumConst(wireName: r'image')
  static const CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum image = _$createModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum_image;

  static Serializer<CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum> get serializer => _$createModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnumSerializer;

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum._(String name): super(name);

  static BuiltSet<CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum> get values => _$createModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnumValues;
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum valueOf(String name) => _$createModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnumValueOf(name);
}

